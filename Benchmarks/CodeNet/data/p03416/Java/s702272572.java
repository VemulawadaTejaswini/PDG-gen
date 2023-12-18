import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i = a; i <= b; i++) {
			int n5 = i / 10000;
			int n4 = (i / 1000) % 10;
			int n2 = (i / 10 ) % 10;
			int n1 = i % 10;
			if(n5 == n1 && n4 == n2) count++;			
		}
        System.out.println(count);
		}	
}
