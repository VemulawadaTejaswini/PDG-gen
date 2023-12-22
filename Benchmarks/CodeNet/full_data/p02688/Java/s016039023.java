import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();
            Set<String> hash_set = new HashSet<>();
            for(int i = 1; i < N*2; i+=2){
              hash_set.add(sc.next());
            }
            System.out.println(N- hash_set.size() + 1);
          }
}