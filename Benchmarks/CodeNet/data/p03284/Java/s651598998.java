import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(N%K==0)
		System.out.println("0");
		else
			System.out.println("1");
	}
}
