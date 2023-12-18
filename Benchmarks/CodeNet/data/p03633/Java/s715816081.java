import java.util.*;
class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      long t=1;
      for(int i=0;i<n;i++)t=getLCM(t,sc.nextLong());
      System.out.print(t);
    }
	public static int getLCM (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (int)(c/b);
	}
}