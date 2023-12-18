import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];
		for(int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		int Nflag = 0;
		int count = 0;
		for(int i = N-1; i>0;i--) {
			for(int j = i-1;j>=0;j--) {
				if(P[i]>P[j]) {
					Nflag++;
					break;
				}
			}
			if(Nflag == 0) {
				count++;
			}
			Nflag = 0;
		}
		System.out.println(count+1);
	}

}
