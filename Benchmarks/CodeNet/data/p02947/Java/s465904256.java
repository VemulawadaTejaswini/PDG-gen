import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] s = new String[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            String[] arrS = sc.next().split("");
            Arrays.sort(arrS);
            String anagrams = String.join("", arrS);
            for (int j = 0; j < i; j++) {
                if (anagrams.equals(s[j])) {
                    result++;
                }
            }
            s[i] = anagrams;
        }

        System.out.println(result);
    }
}
