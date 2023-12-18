public class Main {

    public static void main(String[] args) {

        int a = new java.util.Scanner(System.in).nextInt();
        int b = new java.util.Scanner(System.in).nextInt();
        int c = new java.util.Scanner(System.in).nextInt();

        boolean isKawaisou = false;
        if (a == b && a != c) {
            isKawaisou = true;
        }
        if (a == c && a != c) {
            isKawaisou = true;
        }
        if (b == c && a != b) {
            isKawaisou = true;
        }

        if (isKawaisou) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}