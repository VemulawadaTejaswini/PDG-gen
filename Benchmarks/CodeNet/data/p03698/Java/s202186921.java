import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0 ; i < s.length() ; i++) {
            for (int j = 0 ; j < s.length() ; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                   System.out.println("No");
                   return;
                }
            }
        }
        System.out.println("Yes");
    }

}