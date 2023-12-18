import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int count = 0;
            for(int i = 0; i < N; i++){
              int j = sc.nextInt();
              int k = sc.nextInt();
              int l = k - j + 1;
              count += l;
            }
            System.out.println(count);
          }
}