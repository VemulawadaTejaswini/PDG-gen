
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		String S = sc.next();
		S += ".";
		boolean flag = false;
		while(B <= D) {
			int Apre = A;
			int Bpre = B;
			while(Apre < C) {
				if(S.charAt(Apre) != '#' && Apre + 1 != Bpre) {
					Apre++;
				} else if(S.charAt(Apre + 1) != '#' && Apre + 2 != Bpre) {
					Apre = Apre + 2;
				} else {
					break;
				}
			}
			if(Apre == C) {
				while(Bpre < D) {
					if(S.charAt(Bpre) != '#' && Bpre + 1 != Apre) {
						Bpre++;
					} else if(S.charAt(Bpre + 1) != '#' && Bpre + 2 != Apre) {
						Bpre = Bpre + 2;
					} else {
						break;
					}
				}
			}
			if(Apre == C && Bpre == D) {
				flag = true;
				break;
			} else {
				if(S.charAt(B) != '#') {
					B++;
				} else if(S.charAt(B + 1) != '#') {
					B = B + 2;
				} else {
					B = D + 1;
				}
			}
		}
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
