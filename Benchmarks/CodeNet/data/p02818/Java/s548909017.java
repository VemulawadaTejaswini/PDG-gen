public class Main {

    public static void num(int a, int b, int k) {
        if (k == 0) {
            System.out.println("a =" + a + "b =" + b);
        } else {
            for (int i = 0; i < k; i++) {
                if (a >= 1) {
                    a--;
                } else if (b >= 1) {
                    b--;
                }
            }
            System.out.println("a =" + a + "b =" + b);
        }
    }

    public static void main(String[] args) {
        num(33,22,1);
    }
}
