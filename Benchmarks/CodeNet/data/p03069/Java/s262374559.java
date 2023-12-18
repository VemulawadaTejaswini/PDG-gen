import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		String S=sc.next();

		int black=0;
		int white=0;

		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='#' && i!=0) black++;
			else white++;
		}

		if(white>black) System.out.println(black);
		else System.out.println(white);

		sc.close();
	}

}
