import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int ans = N;
	        int Yaku1 = 0;
	        int Yaku2 = 0;
			
			for (int i=1; i<N; i++){
				if (N % i ==0){
					Yaku1 = i;
					Yaku2 = N / Yaku1;
					if (ans >= Yaku1 + Yaku2){
						ans = Yaku1 + Yaku2;
					}
				}
			}
			
			System.out.println(ans - 2);
	}
}