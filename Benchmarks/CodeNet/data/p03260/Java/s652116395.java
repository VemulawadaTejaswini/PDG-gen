import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		long totalnum=0;

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int B = sc2.nextInt();
		if(A != 2 && B != 2){
			System.out.print(Yes);
		}else{
			System.out.print(No);
		}
	}
}