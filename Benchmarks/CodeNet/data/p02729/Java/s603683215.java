import java.util.*;

public class Main
{
    static int factorial(int n) {
   int fact = 1;
   int i = 1;
   while(i <= n) {
      fact *= i;
      i++;
   }
   return fact;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int comb1,comb2,comb;
		
		comb1 = factorial(n) / (factorial(2) * factorial(n-2));
		comb2 = factorial(m) / (factorial(2) * factorial(m-2));
		comb=comb1+comb2;
		System.out.println(""+comb);
	}
}
