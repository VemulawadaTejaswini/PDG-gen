import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            System.out.println(canObtain(str) ? "YES" : "NO");
        }
    }

    public static boolean canObtain(String str) {
        String keyence = "keyence";
        int currKeyenceIndex = 0;
        boolean garbageStarted = false;
        boolean garbageEnded = false;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) != keyence.charAt(currKeyenceIndex)) {
                if (!garbageStarted) {
                    garbageStarted = true;
                } else {
                    if (garbageEnded) {
                        return false;
                    }
                }
            } else {
                currKeyenceIndex++;
                if (currKeyenceIndex == keyence.length()) {
                    return (i == str.length() - 1 || !garbageStarted);
                }
            }
        }
        return false;
    }
}
