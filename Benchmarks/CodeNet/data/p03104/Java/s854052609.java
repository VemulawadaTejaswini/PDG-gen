import java.util.Scanner;

public class Main{

	public static void main (String[] args) {

		Main main = new Main();

		main.solve();
	}

	private void solve() {

		Scanner scanner = new Scanner (System.in);

		long A = scanner.nextLong();
		long B = scanner.nextLong();

		StringBuffer kekka = null;
		StringBuffer sb1 = null;

		if (A!=B) {

			for (long number=A; number<B; number++) {

				if (number==A) {
					sb1 = new StringBuffer (Long.toBinaryString(number));
				} else {
					sb1 = kekka;
				}

				long num2 = number+1;

				StringBuffer sb2 = new StringBuffer (Long.toBinaryString(num2));

				kekka = null;
				for (int index=0; index<sb1.length(); index++) {

					if (sb1.length()<sb2.length()) {
						sb1.insert(0, '0');
					}
					try {
						kekka.append(String.valueOf(sb1.charAt(index)^sb2.charAt(index)));
					} catch (Exception e){

						if ((sb1.charAt(index)^sb2.charAt(index))==0) {

						kekka= new StringBuffer ("0");

						} else {

						kekka= new StringBuffer ("1");

						}
					}
				}
			}
			System.out.println(Integer.parseInt(kekka.toString(), 2));

		} else {
			System.out.println(A);
		}
	}
}