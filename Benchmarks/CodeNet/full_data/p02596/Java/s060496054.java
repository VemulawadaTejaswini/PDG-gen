import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();

    if(k%2==0||k%5==0){
      System.out.println(-1);
      return;
    }

    if(k%7==0){
      k = k / 7;
     } 
    int loop = 1;
    int surp = 10 % (9 * k);
   

    while(surp != 1){
      loop++;
      surp = surp * 10 % (9 * k);
    }

    System.out.println(loop);
    return;
  }
}