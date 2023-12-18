import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main{
	static int n;
	static long ans = 1000000000;
	static int[] memo;
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = new int[M];
		int[] Y = new int[M];
		int[] count = new int[N];				//県ごとの市の生まれた順番を記憶
		Map<Integer, Integer> map = new TreeMap<>();
		for(int i = 0;i < M;i++){
			P[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			map.put(Y[i], i);
		}
		int num;
		for(Integer index :map.values()){
			num = P[index]-1;					//index調整
			if(count[num] == 0){				//もしその県にまだ何も生まれてなかったら
				count[num] = 1;
				Y[index] = count[num];			//順番(1番目)を記憶
			}else{
				count[num]++;
				Y[index] = count[num];			//順番を記憶
			}
		}
		
		for(int i = 0;i < M;i++){
			System.out.println(String.format("%06d%06d", P[i],Y[i]));
		}


	}
}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}
