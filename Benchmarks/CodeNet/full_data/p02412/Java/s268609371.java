import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			while (true) {
				int n = sc.nextInt();
				int x = sc.nextInt();

				if ((n == 0) && (x == 0)) break;

				int a = Count(n,x);
				System.out.println(a);
			}
		}
	}


	static int Count(int n, int x) {
		int pattern = 0;
		for (int i=1; i <n; i++) {
			for (int j=i+1; j<n; j++) {
				int s = x - i - j; //差を求める
				if ((s!=i) && (s!=j)) {  //同じ数字を排除
					if (((s<=n) && (s>0)) && (s>j)) {  //条件：0<差<n と 差はjより大きい（前の数字は計算済み）
							//System.out.println(i +" " + j+" "+s);
							pattern++;
					}
				}
			}
		}
		return pattern;
	}
	
}

