import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int cat = sc.nextInt();
            int animal = sc.nextInt();
            int cats = sc.nextInt();
            int a = animal - cat;
            if(cat + a >= cats && cat<=cats){
              System.out.println("YES");
            }  else {
              System.out.println("NO");
            }
          }
}