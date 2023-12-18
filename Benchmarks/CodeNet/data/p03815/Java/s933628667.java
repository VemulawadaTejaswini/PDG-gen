import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		
		long a = (Math.floorDiv(x, 11))* 2;
		long b = x % 11;
		
		if(b > 6) {
			a += 2;
		}
		else if(b > 0 && b <= 6) {
			a++;
		}
		
		System.out.println(a);
	}

}
