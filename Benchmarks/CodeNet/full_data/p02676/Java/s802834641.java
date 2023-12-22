import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = Integer.parseInt(a);
		String s = sc.nextLine();
		if(s.length()>b) {
		for (int i = 0; i < b; i++) {
		   System.out.print(s.charAt(i));
		}	
			System.out.println("...");
		}else {
			System.out.println(s);
		}
	}

}
