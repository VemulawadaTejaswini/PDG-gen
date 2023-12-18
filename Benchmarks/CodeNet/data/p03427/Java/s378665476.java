import java.util.Scanner;

public class Main {
		public static int length(long n)
		{
			int count=0;
			while(n!=0)
			{
				count++;
				n/=10;
			}
			return count;
		}
		public static void main(String[] args){
			
			Scanner s = new Scanner(System.in);
			long n=s.nextLong();
			int nSum=0;
			int length = length(n);
			int firstDigit = Integer.parseInt(Long.toString(n).substring(0, 1));
			while(n!=0)
			{
				nSum+=n%10;
				n/=10;
			}
			int max = Integer.max(9*(length-1)+firstDigit-1,nSum);
			System.out.println(max);
		}	
}