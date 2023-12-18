import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {

        long a;
        String text = "1817181712114";
         int count = 0;
         if(4 <= text.length()) {
             for (int i = 0; i < text.length() - 3; i++) {
                 for (int j = i + 3; j < text.length(); j++) {
                     a = Long.parseLong(text.substring(i, j));
                     if (a % 2019 == 0) {
                         count++;
                     }
                 }
             }
         }
         System.out.print(count);
    }
}