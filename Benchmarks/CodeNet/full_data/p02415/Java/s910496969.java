import static java.lang.System.out;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().split("");
        Pattern upper = Pattern.compile("[a-z]");
        Pattern lower = Pattern.compile("[A-Z]");
        for(String str : strs) {
            Matcher mUpper = upper.matcher(str);
            Matcher mLower = lower.matcher(str);
            if (mUpper.find()) {
                out.print(str.toUpperCase());
            } else if(mLower.find()) {
                out.print(str.toLowerCase());
            } else {
                out.print(str);                                        
            }
        }
        out.println();
    }
}