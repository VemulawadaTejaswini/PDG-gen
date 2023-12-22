import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] da_str = in.nextLine().split(" ");
		double[] da = new double[4];
		for(int i=0;i<da_str.length;i++) {
			da[i] = Double.parseDouble(da_str[i]);
		}
		double d = Math.sqrt(Math.pow(da[2] - da[0], 2.0) + Math.pow(da[3] - da[1], 2.0));
		System.out.println(d);
	}
}