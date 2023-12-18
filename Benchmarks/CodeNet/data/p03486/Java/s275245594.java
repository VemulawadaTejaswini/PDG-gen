import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String s = scan.next();
			Character[]S = new Character[s.length()];
			for(int i = 0;i<s.length();i++) {
				S[i] = s.charAt(i);
			}

			Arrays.sort(S);


			String t = scan.next();
			Character[]T = new Character[t.length()];
			for(int i = 0;i<t.length();i++) {
				T[i] = t.charAt(i);
			}

			Arrays.sort(T,Collections.reverseOrder());


			/*
			for(int i = 0;i<S.length;i++)System.out.print(S[i]);
			System.out.println();
			for(int i = 0;i<T.length;i++)System.out.print(T[i]);
			*/



			int ok = 1;
			int i = 0;
			while(true) {
				if(S[i]==T[i]) {
					i++;
					if(i==S.length)break;
				}else if(S[i]<T[i]) {
					break;
				}else {
					ok=0;
					break;

				}
			}

			if(ok==0) {
				System.out.println("No");
			}else {
				if(i==S.length) {
					if(S.length<T.length) {
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}

				}else {
					System.out.println("Yes");
				}

			}








		}


	}


}
