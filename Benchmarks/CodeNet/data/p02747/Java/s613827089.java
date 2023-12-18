import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		String[] S2=S.split("");

		for(int i=0;i<S2.length;i+=2) {
			if(S2[i].equals("h")) {
				if(!S2[i+1].equals("i")) {
					System.out.println("No");
					System.exit(0);
				}
			}else {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}
