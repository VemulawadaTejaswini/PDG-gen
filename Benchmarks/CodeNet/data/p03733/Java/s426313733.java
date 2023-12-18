import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt();
    long t=sc.nextLong(),f=0;
    long[] a=new long[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
      if(i==0){
        f+=t;
      }else{
        if(a[i]-a[i-1]>t){
          f+=t;
        }else{
          f+=(a[i]-a[i-1]);
        }
      }
    }
    System.out.println(f);
  }
}
