import java.util.*;
//import java.util.Arrays;

public class Main { //クラス名はMain
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());

      while(true){
        b -= a;
        if(b == 0){
          System.out.println("Yes");
          break;
        }
        d -= c;
        if(d == 0){
          System.out.println("No");
          break;
        }
      }

    }
}
