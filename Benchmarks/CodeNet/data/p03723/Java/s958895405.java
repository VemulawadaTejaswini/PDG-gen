
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A= sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int ans =0;
    int resA=0;
    int resB=0;
    int resC=0;
    for(int i=0;i<1000000;i++){
      if(A%2==0&&B%2==0&&C%2==0){
        ans++;
        resA=B/2+C/2;
        resB=A/2+C/2;
        resC=A/2+B/2;
        A=resA;
        B=resB;
        C=resC;
      }else{
        break;
      }
    }
    if(ans==1000000){
      System.out.println(-1);
    }else{
      System.out.println(ans);
    }


  }
  

  
}
