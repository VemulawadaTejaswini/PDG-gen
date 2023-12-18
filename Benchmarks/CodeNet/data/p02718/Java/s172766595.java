	import java.util.Scanner;
	
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			long N, M, sum = 0, cnt = 0;
			N = sc.nextLong();
			M = sc.nextLong();
			long[] Arr = new long[(int) N];
			for (int i = 0; i < N; i++) {
				Arr[i] = sc.nextInt();
				sum += Arr[i];
			}
			
			for(int i = 0; i<N; i++) {
				if(Arr[i]>=sum/4f/M) {
					cnt++;
				}
			}
			System.out.println(cnt<M?"No":"Yes");
	
		}
	}
