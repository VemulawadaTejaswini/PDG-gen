import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int point = s.codePointAt(i);
            if (97 <= point && point <= 122) {
                count[point - 97]++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(Character.toChars(i + 97)[0] + " : " + count[i]);
        }
    }
}