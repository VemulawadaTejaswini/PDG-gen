import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long r = sc.nextLong();
		sc.close();
		if(r - l > 2018) {
			System.out.println(0);
			return;
		}
		long lMod = (l + 2019) % 2019;
		long rMod = (r + 2019) % 2019;
		if(rMod < lMod) {
			System.out.println(0);
		}
		else if(rMod == lMod)
			System.out.print((rMod * (rMod + 1)) % 2019);
		else
			System.out.println((lMod * (lMod + 1)) % 2019);


	}
}

