import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long[] a=new long[4],b=new long[4];
    long sum=0;
    for(int i=0;i<4;i++){
      a[i]=sc.nextLong();
    }
    long n=sc.nextLong();
    b[0]=a[0]*8;
    b[1]=a[1]*4;
    b[2]=a[2]*2;
    b[3]=a[3];
    int f=0;
    for(int i=0;i<2;i++){
      if(b[i]>b[i+1]){
        f=i+1;
      }else{
        f=i;
      }
    }
    if(b[f]>=b[2]){
      for(int i=0;i<n/2;i++){
        sum+=a[2];
      }
      if(n%2==1){
        sum+=a[f];
      }
    }else{
      for(int i=0;i<n;i++){
        sum+=a[f];
      }
    }
    System.out.println(sum);
  }
}
