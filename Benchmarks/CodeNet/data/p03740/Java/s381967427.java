import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x-y==1 || x-y==-1 || x==y)System.out.println("Brown");
		else System.out.println("Alice");
	}
}