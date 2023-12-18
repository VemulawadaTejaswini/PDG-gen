import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = 3;
		if(a == b) sum-=1;
		if(a == c) sum-=1;
		if(b == c) sum-=1;
		System.out.println(sum);
	}
}