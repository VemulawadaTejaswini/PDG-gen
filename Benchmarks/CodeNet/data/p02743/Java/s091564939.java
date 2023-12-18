import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		double aa = lessThanSqrt(a);
		double bb = lessThanSqrt(b);
		double cc = lessThanSqrt(c);


		if(aa + bb < cc) {
			System.out.print("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static long lessThanSqrt (long a) {
        return longSqrt(a-1);
    }

    private static long longSqrt (long a) {
        long b = (long)Math.sqrt(a);
        // 得られた値を2乗して元の値を超える場合は
        // 誤差で1大きくなっているため
        // 誤差修正のため1引いた値を返す
        if(b*b > a) {
            b--;
        }
        return b;
    }
}
