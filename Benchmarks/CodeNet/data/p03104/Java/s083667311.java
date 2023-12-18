import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long a_ = a;
		int[] dig_a = new int[50];
		int j = 0;
		while(a_>0) {
			dig_a[j] = (int)a_%2;
			a_ >>= 1;
			j++;
		}
		StringBuilder sb = new StringBuilder();
		j = 0; long c = 0;
		for (long i = 1; i <= b; i <<= 1) {
			if(i == 1) {
				c = (b-a+1)/2+(b-a+1)%2*dig_a[0];
			}else {
				if(dig_a[j] == 1) {
					c = Math.min(i-(a%i),b-a+1)+Math.max((Math.max(b-a+(a%i)-i+1,0)%(2*i)-i),0);
				}else {
					c = Math.min((Math.max(b-a+(a%i)-i+1,0)%(2*i)),i);
				}
			}
			j++;
			sb.append(c%2);
		}
		sb.reverse();
		System.out.println(Long.parseLong(new String(sb), 2));
		sc.close();
	}
}