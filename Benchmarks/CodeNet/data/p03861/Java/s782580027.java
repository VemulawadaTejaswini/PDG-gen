import java.util.*;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int count=0;
		for(int i=a;i<=b;i++) {
			if(i%x==0) {
				count = count +1;
			}
		}
		System.out.println(count);

	}

}
