import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a =0;
    int flag = 0;
    for (int i = 0; i < N; i++) {
      a  = sc.nextInt();
      if(a%2 == 0){
        if(a%3== 0 || a%5== 0){
        }else{
          System.out.println("DENIED");
          return;
        }
        
      }
    }
    System.out.println("APPROVED");
  }
}

