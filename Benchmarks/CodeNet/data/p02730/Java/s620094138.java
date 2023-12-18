import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		String[] S2=S.split("");
		int N=S2.length;
		for(int i=0;i<N/2;i++) {
			if(!S2[0+i].equals(S2[N-1-i])) {
				System.out.println("No");
				System.exit(0);}
		}
		for(int i=0;i<((N-1)/2)-1;i++) {
			if(!S2[0+i].equals(S2[(N-1)/2-1-i])||!S2[(N+3)/2-1+i].equals(S2[N-1-i])) {
				System.out.println("No");
				System.exit(0);}

	}System.out.println("Yes");
		}
}
