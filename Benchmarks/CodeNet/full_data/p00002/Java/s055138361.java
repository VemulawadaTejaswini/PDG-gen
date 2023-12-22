import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a,b,Keta1 = 0,Keta2 = 0;
		while (stdIn.hasNext()) {
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			for (; a > 0; a = a / 10)
				Keta1 = Keta1 + 1;
			for (; b > 0; b = b / 10)
				Keta2 = Keta2 + 1;
			System.out.println(Keta1 + Keta2);
			Keta1=0;
			Keta2=0;
		}
	}
}