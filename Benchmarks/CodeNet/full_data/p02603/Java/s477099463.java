import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),sum=1000,stock=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(i==0){
        if(a[i]<a[i+1]){
          stock=sum/a[i];
          sum=sum-stock*a[i];
        }
      }else{
        if(stock>0){
          if(a[i]>a[i+1]&&i==n-1){
          sum=sum+stock*a[i];
          stock=0;
          }
        }
        if(i<n-1){
          if(a[i]<a[i+1]){
          	stock=sum/a[i];
         	sum=sum-stock*a[i];
          }
        }
      }
    }
    System.out.println(sum);
  }
}
