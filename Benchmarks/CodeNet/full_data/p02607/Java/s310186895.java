import java.util.*;
public class Main{
  	public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
     
      int N=sc.nextInt();
      int a[];
      for (int i=0;i<N;i++){
        a[i]=sc.nextInt();
      }
      
      int step=0;
      int m=(N+1)/2;
      for (int i=0;i<N;i++){
        if(a[i]%2==1){
        step=step+1;
        }
      }
 
      System.out.println(step);
    }
}