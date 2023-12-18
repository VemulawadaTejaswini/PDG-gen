import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double n1 = n * 100 / 108;
    if ((int)(n1*1.08) == n){
      System.out.println((int)(n1));
    }else if ((int)(n1*1.08)+1 == n){
      System.out.println((int)(n1+1));
    }else{
      System.out.println(":(");
    }
  }
}