import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArray = sc.next().split("");
        String[] akibaArray = "AKIHABARA".split("");
        boolean flag = true;
        int count = 0;
        int i = 0;

        for (; i < akibaArray.length; i++) {
            if (count >= strArray.length) {
                break;
            }
            if (strArray[count].equals(akibaArray[i])) {
                count++;
            } else if (!akibaArray[i].equals("A")) {
                break;
            }
        }

        if (i <= akibaArray.length - 2 || count < strArray.length) {
            flag = false;
        }

        System.out.println(flag ? "YES" : "NO");
    }
}