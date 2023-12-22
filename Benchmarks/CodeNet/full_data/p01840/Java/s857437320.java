import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N=sc.nextInt();//宅配便
			int M=sc.nextInt();//片道の時間
			int T=sc.nextInt();//終了時刻
			boolean[] time=new boolean[T+1];
			for(int i=0; i<N; i++) {
				int num=sc.nextInt();
				for(int j=num-M+1; j<=Math.min(num+M, T); j++) {
					time[j]=true;
				}
			}
			int sum=0;
			for(int i=1; i<=T; i++) {
				if(! time[i]) {
					sum+=1;
				}
			}
			System.out.println(sum);

		}
	}
}
