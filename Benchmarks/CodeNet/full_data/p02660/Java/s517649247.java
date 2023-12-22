import java.util.*;

public class Main {
    public static void main(String[] args) {
		long num = new Scanner(System.in).nextLong();
		calc(num);
	}
	public static void calc (long num) {
		long count = 0;
		int duration_counnt = 0;
		for (long l = 2; l <= 1000000L; l++){
			long jijou = l * l;
			if(num % jijou == 0) {
			num = num / jijou;
			count++;
			}
		}
		printing(count);
	}
	public static void printing(long count) {
		System.out.println(count);
	}
}