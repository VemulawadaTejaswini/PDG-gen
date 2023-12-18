import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        int count = 0;
        String[] arrS = s.split("");
        for (int i = 1; i < s.length(); i++) {
            if (arrS[i - 1].equals(arrS[i])) {
                count++;
                arrS[i] = "rp";
            }
        }
        if (arrS[0].equals(arrS[s.length() - 1])) {
            count++;
        }

        int count2 = 0;
        String[] arrS2 = s.split("");
        for (int i = 1; i < s.length(); i++) {
            if (arrS2[i - 1].equals(arrS2[i])) {
                count2++;
                arrS2[i] = "rp";
            }
        }
        if (arrS2[0].equals(arrS2[s.length() - 1])) {
            count2++;
        }

        count = Math.min(count, count2);
        long result = (long) count * k;
        System.out.println(result);
    }
}
