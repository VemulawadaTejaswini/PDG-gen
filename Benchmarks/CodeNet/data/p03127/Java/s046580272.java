import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),gcd=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++)a[i]=sc.nextInt();
    Arrays.sort(a);
    gcd=GCD(a[0],a[1]);
    for(int i=2;i<n;i++) {
    	gcd=GCD(gcd,a[i]);
    }
    System.out.println(gcd);
  }
	public static int GCD(int min,int max) {
		if(max%min==0)return min;
		else return GCD(max%min,min);
	}
}
