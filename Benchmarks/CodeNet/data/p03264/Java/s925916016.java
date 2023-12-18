import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a;
    int b;

    if(k%2==0){
      a=k/2;
      b=k/2;
      System.out.println(a*b);
    }else{
      a=k/2;
      b=k/2+1;
      System.out.println(a*b);
    }
  }
}
