import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c1 = sc.next().toCharArray();
		char[] c2 = sc.next().toCharArray();
		char[] c3 = sc.next().toCharArray();
		System.out.println(String.valueOf(c1[0]) 
				+ String.valueOf(c2[1]) + String.valueOf(c3[2]));
	}
}
