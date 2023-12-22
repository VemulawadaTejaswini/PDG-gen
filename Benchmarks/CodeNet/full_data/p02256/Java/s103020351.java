import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int number1 = a.nextInt();
		int number2 = a.nextInt();
		
		System.out.println(gcd(number1,number2));

	}
	
	public static int gcd(int x,int y) 
	{
		int temp = 0;
		if(y == 0 ) {return x;}
		if(x<=y) 
		{
			temp =y;
			y=x;
			x= temp;
			return gcd(y,x%y);
		}
		else{return gcd(y,x%y);}
	}

}
