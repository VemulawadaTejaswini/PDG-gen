import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();	// Buffer clear
		String S = sc.nextLine();
		sc.close();
		
		boolean flag = false;
		for(int i = 0;i < N;++i)
			if(S.charAt(2*i) == 'Y')
				flag = true;
		if(flag)
			System.out.println("Four");
		else
			System.out.println("Three");
	}
}
