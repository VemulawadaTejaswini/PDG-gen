import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        for(int i = 0; i < S.length()-1; i+=0) {
            char currentChar = S.charAt(i);
            char nextChar = S.charAt(i+1);
            boolean same = (currentChar == nextChar);
            if(same) {
              S = S.substring(0, i) + S.substring(i+1);
            } else {
                i++;
            }
        }
        
        System.out.println(S.length());
    }
}