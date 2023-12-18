import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		String S=sc.next();

		int black=0;
		int white=0;

		int l_black=N-1;
		int f_white=0;


		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='.') continue;
			else {
				f_white=i;
				break;
			}
		}

		for(int i=N-1;i>=0;i--) {
			if(S.charAt(i)=='#') continue;
			else {
				l_black=i;
				break;
			}
		}

		for(int i=l_black;i>=f_white;i--) {
			if(S.charAt(i)=='.') white++;
			else black++;
		}

		if(white>black) System.out.println(black);
		else System.out.println(white);

		sc.close();
	}

}
