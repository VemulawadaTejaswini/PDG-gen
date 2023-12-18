import java.util.Scanner;

public class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
long st = sc.nextLong();
long en = sc.nextLong();
long l = sc.nextLong();
long m = sc.nextLong();
long sum = 0;
sum -= (en / l + en / m);
sum += st / l + st / m;
sum += en + en / (l * m / gcd(l, m));
System.out.println(sum - st + 1);

}

private static long gcd(long l, long m) {
return l % m == 0 ? m : gcd(m, l % m);
}
}