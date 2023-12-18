import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String ans = "2018/" + s.substring(5,10);		
		System.out.println(ans);
		
		sc.close();
	}
}
