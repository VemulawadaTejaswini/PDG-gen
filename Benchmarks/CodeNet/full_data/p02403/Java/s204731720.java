import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		int k = 0;
		while (k == 0) {
			String line = sc.nextLine();
			String[] x = line.split(" ");
			int H = Integer.parseInt(x[0]);
			int W = Integer.parseInt(x[1]);
			if (H == 0 && W == 0) {
				break;
			}
			int i = 0;
			String str = "";
			while (i < W) {
				str += "#";
				i++;
			}
			int j = 0;
			while (j < H) {
				System.out.println(str);
				j++;
			}
			System.out.println("");
		}
	}

}