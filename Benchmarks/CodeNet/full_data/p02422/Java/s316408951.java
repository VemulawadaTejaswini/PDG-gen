
import java.util.Scanner;

public class Main {
	static StringBuilder sb;
	static void print(int a, int b){
		System.out.println(sb.substring(a, b + 1));
	}
	static void reverse(int a, int b){
		String str = new StringBuilder(sb.substring(a, b + 1)).reverse().toString();
		sb.replace(a, b + 1, str);
	}
	static void replace(int a, int b, String str){
		sb.replace(a, b + 1, str);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder(sc.next());
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String s = sc.next();
			switch(s){
				case "print":
					print(sc.nextInt(), sc.nextInt());
					break;
				case "reverse":
					reverse(sc.nextInt(), sc.nextInt());
					break;
				case "replace":
					replace(sc.nextInt(), sc.nextInt(), sc.next());
			}
		}
	}
}


