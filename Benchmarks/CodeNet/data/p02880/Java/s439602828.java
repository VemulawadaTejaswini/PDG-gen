import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int N;
		Scanner sc= new Scanner(System.in);
		N=sc.nextInt();
		if (N>=1||N<=81 ){
			if (N%2==0||N%3==0||N%4==0||N%5==0||N%6==0||N%7==0||N%8==0||N%9==0)
				System.out.print("Yes");
			else 
				System.out.print("no");
			}
		else
			System.out.print("No");

	}
}
