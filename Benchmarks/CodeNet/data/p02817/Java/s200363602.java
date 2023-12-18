import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String S, T;
	S = sc.next();
	T = sc.next();

	String ans = T + S;

	System.out.println(ans);
    }
}