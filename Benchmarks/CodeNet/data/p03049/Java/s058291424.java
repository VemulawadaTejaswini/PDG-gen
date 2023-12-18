import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] S = new String [n];
		String C = sc.next();
		//System.out.println(C);
		for (int i = 0; i<n-1; i++){
			S [i] = sc.next();
			//System.out.println(S[i]);
			if (C.charAt(C.length()-1) == 'A' && S[i].charAt(0) == 'B'){
				C = C+S[i];
			}
			else if (S[i].charAt(S[i].length()-1) =='A'){
				C = S[i]+C;
			}
			else if (S[i].charAt(0) == 'B'){
				C = S[i]+C;
			}
			else {
				C = C+S[i];
			}
		}
		//System.out.println(C);
		int count = 0;
		for (int i = 0; i<C.length(); i++){
			if (C.charAt(i)=='A'){
				if (C.charAt(i+1) =='B'){
					count++;
				}
			}
		}
		System.out.println(count);
	}
	

}
