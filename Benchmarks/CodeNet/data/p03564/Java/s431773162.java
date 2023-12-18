import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int num = 1;
		System.out.println(n +" "+k);
		while(n>0)
		{
			if(num  < k)
			{
				num*=2;
			}
			else 
			{
				num+=k;
				
			}
			n--;
		}
		System.out.println(num);

	}

}