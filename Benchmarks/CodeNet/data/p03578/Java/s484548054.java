
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] Ds = new int[200000];
		for (int i = 0; i < N; i++) {
			Ds[stdIn.nextInt()-1]++;
		}
		int M = stdIn.nextInt();
		int[] Ts = new int[M];
		for (int i = 0; i < M; i++) {
			Ts[i] = stdIn.nextInt();
		}

		boolean flag = true;
		for (int i = 0; i < M; i++) {
			if(Ds[Ts[i]-1]==0){
				flag = false;
				break;
			}else{
				Ds[Ts[i]-1]--;
			}
		}
		if (flag) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}