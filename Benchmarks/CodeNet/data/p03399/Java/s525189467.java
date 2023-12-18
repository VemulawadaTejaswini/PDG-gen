import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		int s = 0;
		if(a>=b) {
			s+=b;
		} else {
			s+=a;
		}
		if(c>=d) {
			s+=d;
		} else {
			s+=c;
		}
		System.out.println(s);
	}

}
