import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//D
		int L = sc.nextInt();
		int N = 0;
		int M = 0;
		ArrayList<int[]> ans = new ArrayList<>();


		while(1 << N <= L)N++;

		for(int i = 1; i < N ; i++){
			ans.add(new int[]{i,i+1,0});
			ans.add(new int[]{i,i+1,1<<(i-1)});
		}

		int now = 1 << (N-1) -1;

		for(int i = N-1 ; i >= 1 ; i--){
			if(now == L-1)break;
			int tmp = 1 << (i-1);
			if(now + tmp <= L-1){
				ans.add(new int[]{i,N,now+1});
				now += tmp;
			}
		}

		M = ans.size();

		System.out.println(N+" "+M);
		for(int[] result : ans){
			System.out.println(result[0]+" "+result[1]+" "+result[2]);
		}
	}
}