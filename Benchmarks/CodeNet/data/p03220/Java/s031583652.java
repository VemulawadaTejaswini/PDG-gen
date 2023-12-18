import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] ta = convInt(sc.nextLine().split(" "));
		int t = ta[0], a = ta[1];
		int[] hA = convInt(sc.nextLine().split(" "));
		int result = 0;
		double tmp = Double.MAX_VALUE;
		for (int i = 0; i < hA.length; i++) {
			double ave = t - hA[i] * 0.006;
			double diff = Math.abs(a - ave);
			if (diff < tmp) {
				tmp = diff;
				result = i;
			}
		}
		System.out.println(++result);
	}

	private static int[] convInt(String[] args) {
		int len = args.length;
		int[] intA = new int[len];
		for (int i = 0; i < len; i++) {
			intA[i] = Integer.parseInt(args[i]);
		}
		return intA;
	}
}