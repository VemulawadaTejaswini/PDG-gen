import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] a = new long[n];
      long s = 0;
      for(int i = 0;i < n;i++){
        a[i]=sc.nextLong();
        s+=a[i];
      }
      long min = Long.MAX_VALUE;
      if(s-n*(n+1)/2>=0){
      	for(long i = 0;i < 1000000000;i++)min = Math.min(min,Math.abs(s-n*i-n*(n+1)/2));
      }else{
      	min = Math.abs(s-n*(n+1)/2);
      }
      System.out.println(min);
    }
}