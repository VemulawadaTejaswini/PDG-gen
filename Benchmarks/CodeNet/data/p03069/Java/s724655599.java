import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		String[] S=sc.nextLine().split("");
		int result=0;

		for(int i=0;i<S.length-1;i++) {
			if(S[i].equals("#") && S[i+1].equals(".")) {
				result++;
				S[i+1]="#";
			}
		}
		
		System.out.println(result);
	}
}