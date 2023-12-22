import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt();
    long[] a=new long[n];
    long sum=0,f=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
      sum*=a[i];
      if(sum>1000000000000000000){
        System.out.println(-1);
        f++;
      }
    }
    if(f==0){
      Systeml.out.println(sum);
    }
  }
}
