import java.util.Scanner;
public class Main {

			public static void main(String[]args) {
			
				Scanner sc = new Scanner(System.in);
				int N = sc.nextInt();
				long NL[] = new long[N];
				int Kmax = sc.nextInt();
				
				for(int i =0; i<N; i++) {
					NL[i] = sc.nextLong();
				}
				int summax =0;
				if(Kmax ==0) {
					System.out.println(NL[0]);
				}
				else {
				for(int i=0; i<Kmax; i++) {
					int sum=0;
					for(int f =0; f<N; f++) {
						sum += i^NL[f];
					}
					if(sum>summax) summax = sum;
				}
				System.out.println(summax);
				}
				
			}
			
			
}
