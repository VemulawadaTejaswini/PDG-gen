import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		boolean judge = true;
		char[] S = (sc.next()).toCharArray();
		for (int i = 1; i < N; i++){
			if (S[i-1] == '#' && S[i] == '#'){
				judge = false;
			}
		}
		if (judge == true){
			if (S[C-1] == '#' || S[D-1] == '#'){
				judge = false;
			}
			else if (C > D){
				if (S[D-1] == '.' && S[D-2] == '#'){
					judge = false;
				}
				else if (S[D-1] == '.' && S[D] == '#'){
					judge = false;
				}
			}
		}
		if (judge == true){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}