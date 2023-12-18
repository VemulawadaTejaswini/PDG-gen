import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String s = scanner.next();

       int count = 0;
       for (int i = 0; i < 3; i++) {
           String str = s.substring(i, i+1);
           if (str.equals("1")) {
               count++;
           }
       }
       System.out.println(count);
    }

}