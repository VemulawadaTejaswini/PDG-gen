import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		String S=sc.next();

		int black=0;
		int white=0;

		boolean check_w=true;

		for(int i=0;i<N;i++) {
			if(check_w && S.charAt(i)=='.') continue;
			if(S.charAt(i)=='.') white++;
			else {
				check_w=false;
				black++;
			}
		}

		if(white>black) System.out.println(black);
		else System.out.println(white);

		sc.close();
	}

}
