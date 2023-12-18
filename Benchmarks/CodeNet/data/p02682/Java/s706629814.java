import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    if(k<=a){
      System.out.println(1*k);
    }else if(a<k && k<=b){
      System.out.println(1*k);
    }else{
      int x = (-1)*(k-a-b);
      System.out.println(a+x);
    }
  }
}
