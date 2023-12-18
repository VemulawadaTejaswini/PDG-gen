import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int b = s.indexOf("A");
	int e = s.indexOf("Z");
	while(s.substring(e+1, e + 2).equals("Z")){
		e++;
	}
	String s2 = s.substring(b, e);
	int n = s2.length();
	System.out.println(n + 1);
}
}
