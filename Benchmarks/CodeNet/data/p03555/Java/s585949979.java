import java.util.Scanner;

public class Main {

	public boolean say= false;
	public void main() {

		Scanner sc = new Scanner(System.in);
		String stra = sc.next();
		String strb = sc.next();
		String strc = sc.next();
		String strd = sc.next();
		String stre = sc.next();
		String strf = sc.next();

		if(stra.equals(strf) && strb.equals(stre) && strc.equals(strd)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}
}
