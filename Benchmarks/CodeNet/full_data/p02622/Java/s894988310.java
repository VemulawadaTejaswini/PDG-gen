import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);

        var s = scaner.next().toCharArray();
        var t = scaner.next().toCharArray();

        long ans = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != t[i]) {
                ans++;
            }
        }

        System.out.println(ans);

        scaner.close();
    }

}