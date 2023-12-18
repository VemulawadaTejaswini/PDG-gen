import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    long[] a=new long[n];
    
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
      for(int j=0;j<i;j++){
        if(a[j]==a[i]){
          
          f++;
          break;
        }
      }
    }
    if(f==0){
      System.out.println("YES");
    }else{System.out.println("NO");}
  }
}