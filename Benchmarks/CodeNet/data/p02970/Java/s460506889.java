import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int d = stdIn.nextInt();
    int ans = 0;
    int i = d;
    int[] a = new int[n];
    if(n<=d/2) {
      System.out.println(1);
      System.exit(0);
    }
    while(true) {
      if(n<i+2*d) {
        ans++;
        System.out.println(ans);
        break;
      }
      i += 2*d;
      ans++;
    }
}
}