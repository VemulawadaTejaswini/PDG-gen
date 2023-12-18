import java.util.*;
public class Main {
    public static void main(String[] args) {
        while(true){
          Scanner sc = new Scanner(System.in);
          String O = sc.nextLine();
          String E = sc.nextLine();
          for (int i = 0; i < O.length() + E.length() ; i++) {
            if (i % 2 == 0) System.out.print(O.charAt(i/2));
              else System.out.print(E.charAt(i/2));
            }
          }
     }
}