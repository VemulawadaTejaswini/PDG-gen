import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String s = sc.nextLine();
			String p = sc.nextLine();

			String ss = s + s;

			if(ss.contains(p)){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}

