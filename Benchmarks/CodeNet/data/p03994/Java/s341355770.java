import java.util.*;
public class Main {
    public static int overflowLimit = 123;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int moves = sc.nextInt();
        String result = findSmallestLexicographString(s, moves);
 
        System.out.println(result);
    }
 
    public static String findSmallestLexicographString(String s, int moves) {
        int index = 0;
        char[] charArr = s.toCharArray();
        while (moves > 0 && index < s.length()) {
            char c = charArr[index];
            int diff = overflowLimit - (int)c;
            if (diff <= moves) {
                c = 'a';
                //System.out.println("Changing char: " + charArr[index] + " to " + c);
                charArr[index] = c;
                moves -= diff;
                //System.out.println("Num remaining: " + moves);
                ++index;
            } else {
                //System.out.println("Breaking");
                ++index;
                continue;
            }
        }
        if (moves > 0) {
            int lastIndex = s.length() - 1;
            int asciiValue = (int)charArr[lastIndex] + moves;
 
            asciiValue = asciiValue >= overflowLimit ? 97 + overflowLimit - asciiValue : asciiValue;
            charArr[lastIndex] = (char)asciiValue;
            //System.out.println("Changing last index to: " + charArr[lastIndex]);
        }
 
        return new String(charArr);
    }
}