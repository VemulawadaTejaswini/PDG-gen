import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n1 = (int)(n * 100 / 108);
    if ((int)(n1*1.08) == n){
      System.out.println(n1);
    }else{
      System.out.println(":(");
    }
  }
}