import java.util.Scanner;

public class Main {

    public static void main (String[] argv){

        Scanner scan = new Scanner (System.in);

        String original = scan.nextLine();
        String inverse  = scan.nextLine();

        if (isInverse(original, inverse)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static boolean isInverse (String s1, String s2){
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) return false;
        }
        return true;
    }

}
