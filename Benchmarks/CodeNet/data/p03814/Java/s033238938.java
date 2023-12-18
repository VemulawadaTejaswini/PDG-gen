import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int A = s.indexOf("A");
		int Z = s.lastIndexOf("Z");
		System.out.println(Z-A+1);

	}

}
