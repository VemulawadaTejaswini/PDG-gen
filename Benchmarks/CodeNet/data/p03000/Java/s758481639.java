import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long X = sc.nextLong();
        long pos = 0l;
        long ans = 0l;
        for(int i=0;i<N;i++){
          long t = sc.nextLong();
          if(pos<=X) ans++;
          else break;
          pos += t;
        }
        System.out.println(ans);
    }
}
