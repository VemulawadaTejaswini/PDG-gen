
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long a[] = new long[3*N];
    for(int i=0;i<3*N;i++){
      a[i]=sc.nextLong();
    }
    Arrays.sort(a);
    long ans =0;
    boolean cnt=false;
    for(int i=3*N-1;i>N-1;i--){
      if(cnt){
        ans=ans+a[i];
        cnt=!cnt;
      }else{
        cnt=!cnt;
      } 
    }

    System.out.println(ans);

    






  }
  

  
}
