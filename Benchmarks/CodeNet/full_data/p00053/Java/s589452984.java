import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
	static int max = 2000000;
	static boolean[] isPrime = new boolean[max];
	public static void main(String[] args) {
		aryPrime();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 2; i < max; i++) {
			if(isPrime[i]) {
				list.add(i);
			}
		}
		long[] a = new long[list.size() + 1];
		for(int i = 0; i < list.size(); i++) {
			a[i + 1] = a[i] + list.get(i);
		}
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			System.out.println(a[n]);
		}
		sc.close();
	}
	static void aryPrime(){
        int l = isPrime.length;
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= (int)Math.sqrt(l); i++) {
            if(isPrime[i]) {
                for(int j = i * 2; j < l; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
