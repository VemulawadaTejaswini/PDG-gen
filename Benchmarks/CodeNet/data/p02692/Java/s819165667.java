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
		int switchAB = 0;
		int switchBC = 0;
		int switchAC = 0;

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
						if(s[i+1].equals("AC")) {
							A++;
							B--;
							result[i] = "A";
						}if(s[i+1].equals("BC")) {
							A--;
							B++;
							result[i] = "B";
						}else {
							if(switchAB == 0) {
								A++;
								B--;
								result[i] = "A";
								switchAB = 1;
							}else {
								A--;
								B++;
								result[i] = "B";
								switchAB = 0;
							}
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
						if(s[i+1].equals("AB")) {
							A++;
							C--;
							result[i] = "A";
						}if(s[i+1].equals("BC")) {
							A--;
							C++;
							result[i] = "C";
						}else {
							if(switchAC == 0) {
								A++;
								C--;
								result[i] = "A";
								switchAC = 1;
							}else {
								A--;
								C++;
								result[i] = "C";
								switchAC = 0;
							}
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
						if(s[i+1].equals("AB")) {
							A++;
							C--;
							result[i] = "A";
						}if(s[i+1].equals("AC")) {
							B--;
							C++;
							result[i] = "C";
						}else {
							if(switchBC == 0) {
								B++;
								C--;
								result[i] = "B";
								switchBC = 1;
							}else {
								B--;
								C++;
								result[i] = "C";
								switchBC = 0;
							}
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

