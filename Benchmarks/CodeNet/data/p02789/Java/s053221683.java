public class Main {
    public static void main(String[] args) {
        System.out.print(a(args) ? "Yes":"No");
    }

    public static boolean a(String[] args) {
        if (args.length != 2) {
            return false;
        }
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        if (i1 < 1) {
            return false;
        }
        if (i1 > 100) {
            return false;
        }
        if (i2 < 0) {
            return false;
        }
        if (i2 > i1) {
            return false;
        }
        if (i1 != i2) {
            return false;
        }

        return true;
    }
}
