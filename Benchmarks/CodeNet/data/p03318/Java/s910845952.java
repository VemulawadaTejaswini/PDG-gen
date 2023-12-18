import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long k;
        try (Scanner cin = new Scanner(System.in)) {
            k = cin.nextLong();
        }

        long[] cur = new long[] {1L, 1L};
        for (long l = 1L, count = 0L; count < k;) {
            System.out.println(l);
            count++;
            if (l < 9) {
                l++;
            } else {
                String ls = Long.toString(l);
                if (ls.charAt(0) == '9') {
                    l += (long)Math.pow(10, ls.length());
                } else {
                    l += (long)Math.pow(10, ls.length() - 1);
                }
            }
        }
    }
}