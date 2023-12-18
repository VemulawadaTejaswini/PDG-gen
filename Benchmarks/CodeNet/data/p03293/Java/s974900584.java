import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res = in.nextLine();
        in.close();
        int[] strs = new int[26];
        int[] ress = new int[26];
        for (int i = 0; i < 26; i++) {
            strs[i] = 0;
            ress[i] = 0;
        }

        for (int i = 0; i < str.length(); i++) {
            strs[charConvertIndex(str.charAt(i))]++;
            ress[charConvertIndex(res.charAt(i))]++;
        }
        String ans = "Yes";
        for (int i = 0; i < 26; i++) {
            if (strs[i] != ress[i]) {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }

    private static int charConvertIndex(char a) {
        return a - 'a';
    }
}