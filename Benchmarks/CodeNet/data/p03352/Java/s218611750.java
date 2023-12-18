import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int jou;
    int max = -1;
    for(int i = 2;i<=100;i++){
      jou = i;

      while(jou <= x){
        jou *= i;
      }
      jou /= i;
      max = Math.max(max,jou);
    }
    System.out.println(max);
  }
}
