import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		if(s.length()%2==1)
			System.out.println("No");
		else {
			if(s.substring(s.length()/2).equals(s.substring(0, s.length()/2)))
					System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
