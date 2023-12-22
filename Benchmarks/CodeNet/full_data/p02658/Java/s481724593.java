import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  long[] a=new long[n];
	  for(int i=0;i<n;i++)a[i]=sc.nextLong();
	  Arrays.sort(a);
	  long sum=1;
	  for(int i=0;i<n;i++) {
		  try{
			  sum=Math.multiplyExact(sum, a[i]);
		  }catch(ArithmeticException e){
			  System.out.println(-1);
			  System.exit(0);
		  }
		  if(sum>1000000000000000000L) {
			  System.out.println(-1);
			  System.exit(0);
		  }
	  }
	  System.out.println(sum);
  }
}

