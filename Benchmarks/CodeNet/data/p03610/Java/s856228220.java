import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.nextLine().toCharArray();
		String answer = "";
		for (int i = 0; i < a.length; i++) {
			if(i % 2 == 0) answer += ""+a[i];
		}
		System.out.println(answer);
	}
}
