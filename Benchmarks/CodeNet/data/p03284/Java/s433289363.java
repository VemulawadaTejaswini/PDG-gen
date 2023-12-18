import java.util.*;
public class Main {
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int cake = 4;
		int donatu = 7;
		
		if (a%cake == 0 || a%donatu == 0 || a%donatu%cake == 0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}