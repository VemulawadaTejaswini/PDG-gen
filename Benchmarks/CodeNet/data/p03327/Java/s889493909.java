import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n < 10){
      System.out.println("ABC00"+n);
    }else if(n < 100){
      System.out.println("ABC0"+n);
    }else if(n < 1000){
      System.out.println("ABC"+n);
    }else{
      System.out.println("ABD"+(n-999));
    }
  }
}
