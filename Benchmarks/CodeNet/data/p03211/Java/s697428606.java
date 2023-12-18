import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int love = 753;
        int minDiff = 10000;

        for (int i = s.length() - 3; i >= 0; i--) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            char c3 = s.charAt(i+2);
            int n = Character.getNumericValue(c1) * 100 + Character.getNumericValue(c2) * 10 + Character.getNumericValue(c3);
            int diff = Math.abs(love - n);
            if (minDiff > diff)
                minDiff = diff;
        }
        System.out.println(minDiff);
    }
}
