import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] a = new long[n];
      long[] s = new long[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      for(int i = 0;i < n;i++){
      	for(int j = 0;j < i;j++)s[i]+=a[j];
      }
      long min = (long)Math.pow(10,10);
      for(int i = 0;i < n-1;i++)min = Math.min(min,Math.abs(s[i+1]-s[i]));
      System.out.println(min);
    }
}
