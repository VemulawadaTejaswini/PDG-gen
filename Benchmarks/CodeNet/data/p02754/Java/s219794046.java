import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int syou = n/(a+b);
		int amari = n%(a+b);
		int result = syou*a;
		if(amari >= a) {
			result = result + a;
		} else {
			result = result + amari;
		}
		System.out.println(result);
		in.close();
	}
}
