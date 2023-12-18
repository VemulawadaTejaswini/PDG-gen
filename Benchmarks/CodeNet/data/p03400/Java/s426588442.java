import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int people= sc.nextInt();
            int days = sc.nextInt();
            int rest_cho = sc.nextInt();
            int ans = 0;
            for(int i = 0; i < people; i++){
              int eat = sc.nextInt();
              ans += days / (eat+1) + 1;
            }
            ans += rest_cho;  
            System.out.println(ans);
              }
}