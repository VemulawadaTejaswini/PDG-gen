import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		a = a.replace("A", "");
		System.out.println(a.length() == 0 ? "Yes" : "No");
	}
}
