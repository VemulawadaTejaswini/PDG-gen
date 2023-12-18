import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("");
		sc.close();
		boolean f1 = true;
		boolean f2 = true;
		for(int i = 0; i < s.length; i++) {
			if(f1) {
				if(s[i].equals("C"))  f1 = false;
			}else if(!f1) {
				if(s[i].equals("F")) {
					f2 = false;
					break;
				}
			}
		}
		if(!f1 && !f2)  System.out.println("Yes");
		else System.out.println("No");

	}
}
