import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0,ans=0;
    int[] a=new int[n],b=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      if(a[i]>f){
        ans=a[i]+b[i];
      }
    }
    System.out.println(ans);
  }
}
