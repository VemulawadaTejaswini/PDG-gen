import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int x = in.nextInt();
		String NO = "No", YES = "Yes";
		if(x!=N) System.out.println(NO);
		else{
			System.out.println(YES);
			for (int i = 1; i <= 2*N-1; i++) {
				System.out.println(i);
			}
		}
	}
}
