
import java.util.Scanner;

public class AtCoder_String {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
         int kekka = 0;
         for(int i = 0; i < input.length(); i++){
             char c = input.charAt(i);
             if (c=='+')kekka++;
             else kekka--;
         }
        System.out.println(kekka);
    }
}