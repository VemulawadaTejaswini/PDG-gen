import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long y=sc.nextLong();
		if(x+y==0 || (x==1 &&y==1))System.out.println("Brown");
		else{
			if((x+y-1)%4==1 || (x+y-1)%4==2)System.out.println("Brown");
			else System.out.println("Alice");
		}
	}
}