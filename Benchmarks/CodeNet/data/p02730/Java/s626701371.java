import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int first = (s.length()-1)/2;
        int second = (s.length()+3)/2;
        System.out.println(isPalindrom(s) && isPalindrom(s.substring(0,first)) && isPalindrom(s.substring(second-1))?"Yes":"No");
    }

    private static boolean isPalindrom(String substring) {
        return new StringBuilder(substring).reverse().toString().equals(substring);
    }
}