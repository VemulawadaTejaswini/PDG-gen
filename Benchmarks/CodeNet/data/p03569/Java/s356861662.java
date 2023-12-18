import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        if (isPalindrome(s)) {
            System.out.println(0);
            return;
        }

        int xCount = 0;
        String newStr = "";
        String tmp;
        ArrayList<Integer> xPos = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            tmp = s.substring(i, i + 1);
            if (tmp.equals("x")) {
                xCount++;
            } else {
                newStr += tmp;
                xPos.add(xCount);
                xCount = 0;
            }
        }
        xPos.add(xCount);

        int ans = 0;


        if (isPalindrome(newStr)) {
            for (int i = 0; i < xPos.size() / 2; i++) {
                ans += Math.abs(xPos.get(i) - xPos.get(xPos.size() - 1 - i));
            }
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }


    private static boolean isPalindrome(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        return sentence.equals(sb.reverse().toString());
    }
}