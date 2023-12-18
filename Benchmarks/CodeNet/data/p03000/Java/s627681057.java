import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main().run();
    }
    void run() {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] l = new int[n];
      for(int i = 0; i < n; ++i) {
        l[i] = sc.nextInt();
      }
      int a = 0;
      int c = 0;
      for (int j = 0; j < l.length; j++) {
        if (l[0] >= x) {
          break;
        }
      	if (a <= x) {
          c++;
      	}
        a = a + l[j];
      }
      System.out.println(c);
    }
}
