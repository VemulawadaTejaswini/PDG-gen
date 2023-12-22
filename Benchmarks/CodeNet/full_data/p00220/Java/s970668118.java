import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			double val = in.nextDouble();
			if (val < 0) {
				break;
			}
			String ans;
			if (val >= 256) {
				ans = "NA";
			} else {
				int seisu = (int) val;
				int syosu = (int) ((val - seisu) * 16);
				if ((val - seisu) * 16 - syosu != 0) {
					ans = "NA";
				} else {
					StringBuilder sb = new StringBuilder("00000000.0000");
					String seisuB = Integer.toBinaryString(seisu);
					sb.replace(8 - seisuB.length(), 8, seisuB);
					String syosuB = Integer.toBinaryString(syosu);
					sb.replace(13 - syosuB.length(), 13, syosuB);
					ans = sb.toString();
				}
			}
			System.out.println(ans);
		}
	}
}