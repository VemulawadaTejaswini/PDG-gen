import java.util.*;
public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = -1;
    int c = -1;
    int aCount = 1;
    int bCount = 0;
    int cCount = 0;
    for(int i=1; i<n; i++) {
      int temp = sc.nextInt();
      if(temp == a) {
        aCount++;
      } else if(b == -1){
        b = temp;
        c = a ^ b;
        bCount++;
      } else if(temp == b) {
        bCount++;
      } else if(temp == c) {
        cCount++;      
      }
    }
    sc.close();

    boolean result = false;
    if(aCount + bCount + cCount == n){
      if(aCount == bCount && bCount == cCount){
        result = true;
      } else if(b == c && aCount * 2 == bCount && cCount == 0) {
        result = true;
      } else if(a == c && aCount == bCount * 2 && cCount == 0) {
        result = true;
      }
    }
    
    if(result) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
