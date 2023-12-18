import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int D = sc.nextInt();
    if(D<21 || M<4) {
      System.out.println(0);
    }else{
      int D2 = D / 10;
      int D1 = D % 10;
      int count =0;
      if(D1*D2<=M && D1>=2) {
        count = count + D1-1;
      }
      D2--;
      
      while(D2>=2){
        for(int i=9; i>=2;i--){
          if(D2*i<=M) {
            count = count + i-1;
            D2--;
            break;
          } 
        }
      }
      
      System.out.println(count);
    }
  }
}