import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(String.format("%.0f", Math.pow(10,N-2)*N*(N-1)%(Math.pow(10, 9)+7)));			
		sc.close();
	}
}