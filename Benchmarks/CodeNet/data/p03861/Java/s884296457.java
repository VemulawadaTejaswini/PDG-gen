import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong(), x = sc.nextLong(), sum;
		sum = (b-a+1)/x;
		if(x != 1 && a%x == 0 && b%x ==0) sum++;
		System.out.println(sum);
	}
}