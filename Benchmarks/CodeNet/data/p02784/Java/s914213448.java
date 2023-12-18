import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int HP = sc.nextInt();
            int N = sc.nextInt();
            for(int i = 0; i < N; i++){
              int n = sc.nextInt();
              HP -= n;
            }
            if(HP <= 0){
              System.out.println("Yes");
            } else {
              System.out.println("No");
            }
      }
}