import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String O = sc.nextLine();
        String E = sc.nextLine();
        
        for (int i = 0; i < O.length() + E.length() ; i++) {
           if (i % 2 == 0) {
              System.out.println(O.charAt(i/2));
           } else {
              Sustem.out.println(E.charAt(i/2));
            }
         }
   }
}