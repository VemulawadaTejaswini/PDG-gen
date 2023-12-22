import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Main {

	static long[] orthometric;  //海抜
	static Long[] sea;  //海の変化
	static int num = 0;  //配列の長さ

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int len = sc.nextInt();
			orthometric = new long[len];  //海抜
			TreeSet<Long> seas = new TreeSet<Long>();
			long now = -1l;
			seas.add(0l);  //最初は0から始まる
			for (int i=0; i<len; i++) {
				long a = sc.nextLong();  //海抜を読み込み
				if (a != now) {  //隣が同じ高さだと無視
					orthometric[num] = a;  //海抜を読み込み
					seas.add(a);  //海の変化を読み込み
					now = a;
					num++;
				}
			}
			//for (int i=0; i<num; i++) System.out.print(i +"  : "+orthometric[i]+"      ");
			//System.out.println();
			sea = new Long[seas.size()];
			seas.toArray(sea);  //配列にする
			//for (int i=0; i<num; i++)System.out.println(orthometric[i]);
			List<int[]> land = new ArrayList<int[]>();
			land.add(new int[]{0,num});  //最初は全部
			int max = findLand(0, land);
			System.out.println(max);
		}
	}

	public static int findLand(int max, List<int[]> land) {
		int pointer = 0;
		while (pointer<sea.length) {
			int count = 0;
			int[] newLand = new int[2];
			List<int[]> l = new ArrayList<int[]>();
			for (int[] j : land) {
				//System.out.println("land-----"+land.size()+"SEA:"+sea[pointer]);
				newLand[0] = j[0];
				for (int k=j[0]; k<j[1]; k++) {
					//System.out.println("start/end:::::"+j[0]+"/"+j[1]+"  now:::::"+k);
					if (orthometric[k]==sea[pointer]) {  //沈んだら
						if ((k!=j[0])) {  //最初ではなかったら
							count++;
							newLand[1] = k;  //新しい島のエンド
							int[] copy = new int[] {newLand[0],newLand[1]};
							l.add(copy);
							//System.out.println("added:" + newLand[0]+" / "+newLand[1]+" : "+orthometric[newLand[0]]+" / "+orthometric[newLand[1]-1]);
						}
						newLand[0] = k+1;  //新しい島がスタート
					}
				}
				if (orthometric[j[1]-1]!=sea[pointer]) { //最後まで島だったら
					count++;
					newLand[1] = j[1];  //最後を島にする
					int[] copy = new int[] {newLand[0],newLand[1]};
					l.add(copy);
					//System.out.println("added:" + newLand[0]+" / "+newLand[1]+" : "+orthometric[newLand[0]]+" / "+orthometric[newLand[1]-1]);
				}
				//System.out.println("count:" + count);
				max = Math.max(max, count);
			}
			land = new ArrayList<int[]>(l);
			pointer++;
		}
		return max;
	}
}
