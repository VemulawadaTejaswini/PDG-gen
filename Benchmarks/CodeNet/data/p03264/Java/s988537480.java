import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int k = sc.nextInt();
    int kMinus = k - 1;
    
    if (k % 2 == 0) {
      System.out.println((k / 2) * (k / 2));
    } else {
      System.out.println((kMinus / 2) * (kMinus / 2 + 1));
    }
  }
}