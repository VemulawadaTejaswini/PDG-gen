import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    String a = sc.next();
    int length = a.length();
    int result = 1000;
    for (int i = 0; i < length - 2; i++) {
        String first = a.substring(i,i+1);
        int val1 = Integer.valueOf(first) * 100;
        for (int j = i+1; j < length - 1; j++) {
           String second = a.substring(j,j+1);
           int val2 = Integer.valueOf(second) * 10;
           for (int k = j+1; k < length; k++) {
               String third = a.substring(k,k+1);
               int val3 = Integer.valueOf(third);
               int target = Math.abs(val1 + val2 + val3 - 753);
               result = Math.min(result, target);
           }
        }
    }
    // 出力
    System.out.println(result);
  } 
}