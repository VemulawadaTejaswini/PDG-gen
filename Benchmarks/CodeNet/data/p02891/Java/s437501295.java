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

        long result = (long) count * k;
        System.out.println(result - 1);
    }
}
