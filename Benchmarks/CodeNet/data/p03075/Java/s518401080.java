import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int k = sc.nextInt();
    int ab = b-a;
    int bc = c-b;
    int dc = d-c;
    int de = e-d;
    if(ab<=k && bc<=k && cd<=k && de<=k && ab>0 && bc>0 && cd>0 de>0){
      System.out.println("Yay!");
    }else{
      System.out.println(":(");
    }
  }
}
