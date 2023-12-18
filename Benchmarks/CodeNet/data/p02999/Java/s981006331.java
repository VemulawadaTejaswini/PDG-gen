import java.util.Scanner;
public class Main{//ABC130A
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		System.out.println(x<a? 0 :10);
		sc.close();
	}
}