import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine(); //"cdefghnoprstuvwxy"; //sc.nextLine();
        absAlpha(alphabets , S);
    }

    private static void absAlpha(String alphabets, String input) {
        TreeSet<Character> inputset = new TreeSet<>();
        for (int i=0; i<alphabets.length(); i++){
            String str = String.valueOf(alphabets.charAt(i));
            if (!input.contains(str))
                inputset.add(alphabets.charAt(i));
        }
        if (inputset.isEmpty())
            System.out.println("None");
        else {
            for (char c : inputset)
                System.out.print(c);
        }
    }
}
