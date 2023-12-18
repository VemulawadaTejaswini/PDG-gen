import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

 Scanner in = new Scanner(System.in);
 int N = in.nextInt();
 Long array[] = new Long[N];

 for(int cnt = 0; cnt < N; cnt++){
	 array[cnt] = in.nextLong();
 }

 Arrays.sort(array, Comparator.reverseOrder()); // 降順になる

 gcd(array[0],array[N-1]);


 System.out.println(lcm(array[0],array[N-1]));

 in.close();
}

private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}

private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}

}