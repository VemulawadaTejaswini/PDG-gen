import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

boolean success = true;

        int counter = 0;
        while(success) {
            success = false;
        for(int i = 0; i < S.length()-1; i++) {
            char currentChar = S.charAt(i);
            char nextChar = S.charAt(i+1);
            boolean different = (currentChar != nextChar);
            if(different) {
              counter+=2;
              success = true;
              S = S.substring(0, i) + S.substring(i+2, S.length());
            }
        }
        }

        System.out.println(counter);
    }
}