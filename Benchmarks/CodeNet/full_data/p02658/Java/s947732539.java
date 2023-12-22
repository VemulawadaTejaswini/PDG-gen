import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long [] x = new long[N];
		long kekka =1;
		if((2<=N)&&(N<=Math.pow(10,15))) {
		for(int i=0;i<N;i++) {
				x[i] = sc.nextLong();
				kekka = kekka * x[i];
		}
		
			
			if(Math.pow(10,18)<kekka) {
				kekka = -1;
			}
			System.out.println(kekka);
		}
		sc.close();
	}

}