import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int x = stdIn.nextInt();
    int[] l = new int[n];
    for(int i = 0;i<n;i++) {
      l[i] = stdIn.nextInt();
    }
    int count = 0;
    int current = 0;
     while(true) {
       if(current<=x) {
         count += 1;
         if(count-1==l.length) break;
         current = current + l[count-1];
       } else {
         break;
       }
     }
     System.out.println(count);
  }
}
