import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static boolean check[];
	public static final int NUM = 2000;
	public static int N;
	public static int table[];

	public static void main(String[] args) {

		check = new boolean[NUM+1];

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		table = new int[N];

		for(int i = 0; i < N; i++){
			table[i] = sc.nextInt();
		}

		recursive(0,0);

		int num_query = sc.nextInt();

		int tmp;
		StringBuilder ans = new StringBuilder();

		for(int loop = 0; loop < num_query; loop++){

			tmp = sc.nextInt();
			if(check[tmp]){
				ans.append("yes\n");
			}else{
				ans.append("no\n");
			}
		}

		System.out.print(ans.toString());
	}

	public static void recursive(int index,int sum){
		if(index == N){
			check[sum] = true;
			return;
		}

		recursive(index+1,sum);
		if(sum+table[index] <= NUM){
			recursive(index+1,sum+table[index]);
		}
	}

}


