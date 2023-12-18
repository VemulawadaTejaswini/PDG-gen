    import java.util.*;
    public class Main {
      public static void main(String...args) {
      	final Scanner sc = new Scanner(System.in);
        final long X = sc.nextLong();
        final long Y = sc.nextLong();
        int ans = 0;
        for(long l = Y; l >= X; l >>= 1)
          ans++;
        System.out.println(ans);
      }
    }