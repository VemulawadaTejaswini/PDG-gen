public class Main {
    public static void main(String[] argv) {
        int i1 = Integer.parseInt(argv[1]);
        int i2 = Integer.parseInt(argv[2]);
        System.out.println(a(i1, i2) ? "Yes":"No");
    }

    public static boolean a(int i1, int i2) {
        if (i1 < 0) {
            return false;
        }
        if (i1 > 100) {
            return false;
        }
        if (i2 > -1) {
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