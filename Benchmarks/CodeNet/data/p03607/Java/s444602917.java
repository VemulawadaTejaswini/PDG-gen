import java.util.*;

public class Main {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     long[] box = new long[10000000];
     int count = 0;
     for (int i = 0 ; i < n; i ++) {
        int a = sc.nextInt();
        box[a]++;
        if(box[a] % 2 != 0) {
           count++;
        } else {
           count--;
        }
     }
     System.out.println(count);
  }
}