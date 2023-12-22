
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		String[] s = new String[N];
		String[] result = new String[N];

		int i = 0;
		while(i < N) {
			s[i] = sc.next();
			i++;
		}

		boolean judge = true;


		for(i = 0 ; i < N; i++) {
			if(s[i].equals("AB")) {
				if(A == 0 && B == 0) {
					judge = false;
					break;
				}else {
					if(A > B) {
						A--;
						B++;
						result[i] = "B";
					}else if(A < B){
						A++;
						B--;
						result[i] = "A";
					}else {
						if(i <= N-2 && s[i+1].equals("AC")) {
							A++;
							B--;
							result[i] = "A";
						}if(i <= N-2 && s[i+1].equals("BC")) {
							A--;
							B++;
							result[i] = "B";
						}else {
							A++;
							B--;
							result[i] = "A";
						}
					}
				}
			}else if(s[i].equals("AC")) {
				if(A == 0 && C == 0) {
					judge = false;
					break;
				}else {
					if(A > C) {
						A--;
						C++;
						result[i] = "C";
					}else if(A < C){
						A++;
						C--;
						result[i] = "A";
					}else {
						if(i <= N-2 && s[i+1].equals("AB")) {
							A++;
							C--;
							result[i] = "A";
						}if(i <= N-2 && s[i+1].equals("BC")) {
							A--;
							C++;
							result[i] = "C";
						}else {
							A++;
							C--;
							result[i] = "A";
						}
					}
				}
			}else {
				if(B == 0 && C == 0) {
					judge = false;
					break;
				}else {
					if(B > C) {
						B--;
						C++;
						result[i] = "C";
					}else if(B < C){
						B++;
						C--;
						result[i] = "B";
					}else {
						if(i <= N-2 && s[i+1].equals("AB")) {
							B++;
							C--;
							result[i] = "B";
						}if(i <= N-2 && s[i+1].equals("AC")) {
							B--;
							C++;
							result[i] = "C";
						}else {
							B++;
							C--;
							result[i] = "B";
						}
					}
				}
			}
		}

		if(judge == false) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
			for(i = 0; i < N; i++) {
				System.out.println(result[i]);
			}

		}


	}

}

