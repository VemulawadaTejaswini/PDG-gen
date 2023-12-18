import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] a = new long[3*n+1];
      for(int i = 1;i <= 3*n;i++)a[i]=sc.nextLong();
      Arrays.sort(a);
      long sum = 0;
      for(int i = n+1;i <= 2*n;i++)sum+=a[i];
      System.out.println(sum);
    }
}