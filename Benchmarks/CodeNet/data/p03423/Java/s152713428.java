import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int group=n/3;
		int m=n%3;
		if(m!=0&&group<1) System.out.println(0);
		else{
			System.out.println(n/3);
		}
	}

}