//36#5.12s
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Main {

	static List<Long> orthometric;  //海抜
	static Long[] sea;  //海の変化
	//static int num = 0;  //配列の長さ

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int len = sc.nextInt();
			orthometric = new LinkedList<Long>();  //海抜
			TreeSet<Long> seas = new TreeSet<Long>();
			long now = 0l;
			seas.add(0l);  //最初は0から始まる
			for (int i=0; i<len; i++) {
				long a = sc.nextLong();  //海抜を読み込み
				if (a != now) {  //隣が同じ高さだと無視
					orthometric.add(a);  //海抜を読み込み
					seas.add(a);  //海の変化を読み込み
					now = a;
				}
			}
			if (orthometric.size()>0) {
				//System.out.println();
				sea = new Long[seas.size()];
				seas.toArray(sea);  //配列にする
				List<int[]> land = new ArrayList<int[]>();
				land.add(new int[]{0,orthometric.size()-1});  //最初は全部
				int max = findLand();
				System.out.println(max);
			} else System.out.println("0");  //全部0だったら
		}
	}

	public static int findLand() {
		int max = 0;
		List<Long> o = new LinkedList<>(orthometric);
		int count = 1;
		for (long s : sea) {
			//System.out.println("SeaLevel:   " + s);
			while (o.contains(s)) {
				int i = o.indexOf(s);
				//System.out.println("i-----------" + i);
				if ((i!=0)&&(i!=o.size()-1)) {  //最初と最後ではない場合
					if ((o.get(i-1)!=-1)&&(o.get(i+1)!=-1)) count++;  //島の真ん中であればcount+1
					else if ((o.get(i-1)==-1)&&(o.get(i+1)==-1)) count--;  //島はこのエリアしかない場合count-1
				} else if ((i==0)&&(i!=o.size()-1)) {
					if (o.get(i+1)==-1) count--;  //島はこのエリアしかない場合count-1
				} else if ((i!=0)&&(i==o.size()-1)) {
					if (o.get(i-1)==-1) count--;  //島はこのエリアしかない場合count-1
				}
				o.set(i, -1l);
			}
			//System.out.println("count:   " + count);
			max = Math.max(max, count);
		}
		return max;
	}
}
