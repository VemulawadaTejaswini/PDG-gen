
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int ans =-1;
    for(int i=0;i<60000;i++){

      if(Math.floor((double)i*1.08)==N){
        ans=i;
      }
    }
    if(ans==-1){
      System.out.println(":(");
    }else{
      System.out.println(ans);
    }
  }
  

  
}
