import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = gcd(a, b);
		ArrayList<Integer> sosu = new ArrayList<Integer>();
		sosu.add(1);
		long x=c;
		for (int i = 2;i <= c;) {
            if (x % i == 0) { // 最小の因数を求める

                if(i!=sosu.get(sosu.size()-1)){
                sosu.add(i);}
                x /= i; // 最小の因数で割った数を代入する
            } else
                i++;
        }
System.out.println(sosu.size());

	}

	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}


}
