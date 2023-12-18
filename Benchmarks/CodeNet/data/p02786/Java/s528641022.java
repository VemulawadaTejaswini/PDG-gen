import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long count = 1;
		long index = 1;
		while(h>1) {
			h = h/2;
			count = count+index*2;
			index = index*2;
		}
		System.out.println(count);
	}
}
