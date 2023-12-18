import java.util.*;

public class Main {

    public static long grade = 0;

    public static long a;
    public static long b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine());
        String[] P = sc.nextLine().split(" ");
        String[] Q = sc.nextLine().split(" ");
        sc.close();
        StringBuilder sb = new StringBuilder();

        grade = 1;

        for (String val : P) {
            sb.append(val);
        }
        long p = Long.valueOf(sb.toString());
        sb.setLength(0);
        for (String val : Q) {
            sb.append(val);
        }
        long q = Long.valueOf(sb.toString());

        String[] numArray = new String[N];
        boolean[] flags = new boolean[N];
        for (int i = 1; i <= N; i++) {
            numArray[i - 1] = String.valueOf(i);
            flags[i - 1] = false;
        }

        recurse(numArray, flags, p, q, "", N);

        System.out.println(Math.abs(a - b));

    }

    public static void recurse(String[] numArray, boolean[] flags, long p, long q, String esa, int N) {
        if (esa.length() == N) {
            grade++;
            long value = Long.valueOf(esa);
            if (value == p) {
                a = grade;
            } else if (value == q) {
                b = grade;
            }
            return;
        }
        for (int i = 0; i < numArray.length; i++) {
            if (flags[i]) {
                continue;
            }
            String newEsa = esa + numArray[i];
            flags[i] = true;
            recurse(numArray, flags, p, q, newEsa, N);
            flags[i] = false;
        }

    }

}