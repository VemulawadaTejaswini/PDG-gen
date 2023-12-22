import java.util.*;
public class Math{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double money = 10;
		for(int i=0;i<n;i++)
			money*=1.05;	
		System.out.println(Math.ceil(money)*10000);
	}
}