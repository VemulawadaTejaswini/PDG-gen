public class Main {
    public static void main(String[] args) {
        System.out.println(a(args) ? "Yes":"No");
    }

    public static boolean a(String[] args) {
        if (args.length != 2) {
            return false;
        }
        int n; int m;
        try {
            n = Integer.parseInt(args[0]);
            m = Integer.parseInt(args[1]);
        } catch (Exception e) {
            return false;
        }
        if (n < 1) {
            return false;
        }
        if (n > 100) {
            return false;
        }
        if (m < 0) {
            return false;
        }
        if (m > n) {
            return false;
        }
        if (m < n) {
            return false;
        }

        return true;
    }
}
