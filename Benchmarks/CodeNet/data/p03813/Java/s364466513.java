import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int b = s.indexOf("A");
	int e = s.indexOf("Z");
	String s2 = s.substring(b, e);
	System.out.println(s2.length() + 1);
}
}
