import java.util.*;
 
class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = 1000000;
    int exp6 = 0;
    int exp9 = 0;
    for(int i = 0; i < n; i++) {
      if(Math.pow(6, i+1) > n) {
        exp6 = i;
        break;
      }
    }
    for(int i = 0; i < n; i++) {
      if(Math.pow(9, i+1) > n) {
        exp9 = i;
        break;
      }
    }
    System.out.println(getSum(n, exp6, exp9, 0));
  }
  
  private static int getSum(int n, int exp6, int exp9, int count) {
    if(n <= 0) {
      return count;
    } else {
      while(Math.pow(6, exp6) > n) {
        exp6--;
      }
      while(Math.pow(9, exp9) > n) {
        exp9--;
      }
      return Math.min(getSum(n-(int)Math.pow(6, exp6), exp6, exp9, count+1), getSum(n-(int)Math.pow(9, exp9), exp6, exp9, count+1));
      /*if(n-(int)Math.pow(6, exp6) < n-(int)Math.pow(9, exp9)) {
        //System.out.println("Exp 6: " + Math.pow(6, exp6));
        return getSum(n-(int)Math.pow(6, exp6), exp6, exp9, count+1);
      }
      else {
        //System.out.println("Exp 9: " + Math.pow(9, exp9));
        return getSum(n-(int)Math.pow(9, exp9), exp6, exp9, count+1);
      }*/
    }
  }
}