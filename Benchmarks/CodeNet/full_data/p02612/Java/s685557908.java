import java.util.*;

public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextint();
		int souzond = (money / 1000);1;
                System.out.print((souzond*1000)-money);
	}
}