import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),count=0;
    
    while(check(a,b,c)) {
    	long buffa=a/2,buffb=b/2,buffc=c/2;
    	a=buffb+buffc;
    	b=buffa+buffc;
    	c=buffa+buffb;
    	count++;
    }
    System.out.println(count);
  }
	public static boolean check(long a,long b,long c) {
		if(a==b&&a==c) {
			System.out.println(-1);
			System.exit(0);
			return false;
		}else {
			if(a%2==0&&b%2==0&&c%2==0) {
				return true;
			}else {
				return false;
			}
		}
	}
}
