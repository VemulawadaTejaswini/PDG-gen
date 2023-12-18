import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P[] = new int[1000001];
		String S[] = new String[1000001];

		for(int i=0; i<M; i++) {
			P[i] = sc.nextInt();
			S[i] = sc.next();
		}

		//正解数
		int cntAC = 0;
		//ペナルティ数
		int cntWA = 0;
		
		for(int j=0; j<M-1; j++) {
			if(S[j].equals("WA")) {
				cntWA++;
			}
			for(int i=j; i<M-1; i++) {
				if(P[i] == 1000002 || S[i].equals("WA")) {
					break;
				}else if(S[i].equals("AC")) {
					cntAC++;
					for(int k=i+1; k<M+1; k++) {
						if(P[k] == P[i]) {
							P[k] = 1000002;
						}
					}
					break;
				}
			}
		}

		System.out.println(cntAC + " " + cntWA);

	}
}