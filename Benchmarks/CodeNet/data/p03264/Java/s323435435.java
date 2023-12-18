import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		int K = sc.nextInt();
		int even = K/2;
		int odd = even + (K % 2);
		System.out.println(K*(K-1)/2-even*(even-1)/2-odd*(odd-1)/2);
	}
}
