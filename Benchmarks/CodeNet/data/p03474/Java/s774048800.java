import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        String s = sc.next();

        try {
            Integer.parseInt(s.substring(0, a));
            Integer.parseInt(s.substring(a + 1));
            if (!s.substring(a, a+1).equals("-") || s.length() != a + b + 1) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}