import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    double t=sc.nextDouble();

    int start=1;
    int count=0;

    if (a<=t+0.5) {
      while(t+0.5>0){
        t-=a*start;
        start++;
        count++;
      }

      System.out.println(count*b);

    }else{
      System.out.println(0);
    }

    // while(t+0.5>0){
    //   t-=a*start;
    //   start++;
    //   count++;
    // }
    //
    // System.out.println(count*b);

  }
}
