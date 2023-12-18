import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    for(int i=1;i<=k;i++){
      if(a >= 1){
        a-=1;
      } else if(a == 0 && b >= 1){
        b-=1;
      }
    }
    System.out.println(a+" "+b);
  }
}