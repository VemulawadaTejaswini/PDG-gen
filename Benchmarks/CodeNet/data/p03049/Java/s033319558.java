import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] str = new String[N];
        int hitCount = 0;
        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
            String[] splitStr = str[i].split("AB");
            hitCount += splitStr.length - 1;
        }

        int countA = 0;
        int countB = 0;
        for (int i = 0; i < N; i++) {
            Pattern pB = Pattern.compile("^B");
            Matcher mB = pB.matcher(str[i]);
            if (mB.find()) {
                countB++;
            }
            Pattern pA = Pattern.compile("A$");
            Matcher mA = pA.matcher(str[i]);
            if (mA.find()) {
                countA++;
            }
        }
        int joinCount = Math.min(countA, countB);

        System.out.println(hitCount + joinCount);
    }
}
