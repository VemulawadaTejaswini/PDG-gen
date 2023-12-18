import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		if (a == b){
			System.out.println(c);
		}else if (a == c){
			System.out.println(b);
		}else {
			System.out.println(a);
		}
    }
}