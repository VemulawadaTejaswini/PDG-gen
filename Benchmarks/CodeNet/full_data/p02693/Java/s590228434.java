import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int K = s.nextInt();
		int A = s.nextInt();
		int B = s.nextInt();
		
		boolean ans = false;
		for(int i=A; i<=B; i++) {
			if(i%K == 0) {
				ans = true;
				break;
			}
		}
		
		if(ans) {System.out.println("OK");}
		else {System.out.println("NG");}

		
	}

}
