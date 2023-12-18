import java.util.*;

public class Main {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      String[] s = S.split("", 0);
      for(int i = 0; i < N / 2; i++){
        if(!s[i].equals(s[i + N / 2])){
          System.out.println("No");
          return;
        }
      }
      System.out.println("Yes");
    }
}