import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();
      		int d = sc.nextInt();
            Set<String> set1 =new HashSet<>();
            for(int i = 0; i < N; i++){
              set1.add(sc.nextLine());
              String h = sc.next();
            }
            System.out.println(N - set1.size());
          }
}