import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S [] = new String [N]; 
		for(int x=0; x<N; x++) {
		    S[x]= sc.next();
		}
		    
		if(N>=1 && N<=50 && K>=1 && K<=N) {
			for(int i=0; i<N; i++) {
				if(i==K-1) {
					S[i] = S[i].toLowerCase();
				}
			}
		for(int a=0; a<N; a++) {
		    System.out.print(S[a]);
		}
		}
	}
}