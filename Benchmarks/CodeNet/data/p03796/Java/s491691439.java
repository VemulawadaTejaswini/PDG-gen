import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static int times=sc.nextInt();
	private static int power=1;
	public static void main(String[] args){
		for(int i=1;i<=times;i++){
			power=(power*i)%1000000007;
		}
		System.out.println(power);
	}
}