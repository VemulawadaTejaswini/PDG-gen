import java.util.Scanner;
class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		int WHITE = 0;
		int BLACK = 0;
		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='.') {
				WHITE++;
			}
		}
		int min = WHITE;
		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='#') {
				BLACK++;
			}
			else {
				WHITE--;
			}
		}
		min = Math.min(min, WHITE + BLACK);
		System.out.println(min);
	}
}