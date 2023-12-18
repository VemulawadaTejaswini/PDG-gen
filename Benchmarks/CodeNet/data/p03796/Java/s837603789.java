import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 1;
		for(int i = 1;i <= n; i++)
		{
			sum = sum * i;
		}
		System.out.println((int)(sum%(Math.pow(10, 9)+7)));
	}
}	
	

