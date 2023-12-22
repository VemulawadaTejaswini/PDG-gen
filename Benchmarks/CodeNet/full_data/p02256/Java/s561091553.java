import java.util.Scanner;

public class Main {
	
	static int GCD(int x, int y)
	{
		int mod;		
		if(x==0 || y==0) // this if branch is used to deal with some inputs with 0s 
		{
			if(x==0 && y==0) return -1;// If both of x and y are 0, return -1 which means there is no greatest common divisor for x and y.
			else if(x==0)  return y;
			else  return x;
		}			
		else if(x>y) // the following is used to deal with inputs without 0s, and there are three cases: x>y, x<y, or x==y 
		{
			mod = x%y; // to use this observation: given x>=y, gcd(x, y) = gcd(y, x%y)
			if(mod==0) return y; // this if is here for the case that one number is the multiple of the other number, e.g. 10, 20, it will return 10
			else return getGCD(y, mod);
		}
		else if(x<y)// the case of x<y
		{
			mod = y%x;
			if(mod==0) return x;
			else return getGCD(x, mod);
		}			
		else return x; // when x==y, the greatest common divisor is either x or y itself
	}
	
	static int getGCD(int num1, int num2) // num1 >= num2
	{
		int divisor=1;
		for(int i=2; i<=num2; i++)
		{
			int mod1 = num1%i;
			int mod2 = num2%i;
			if(mod1==0 && mod2 ==0)
			{
				if(i>divisor)	divisor=i;
			}
		}
		return divisor;
	}

	public static void main(String argv[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(GCD(x,y));
//        System.out.println(gcd_recursive(x,y));
        in.close();
	}
}

