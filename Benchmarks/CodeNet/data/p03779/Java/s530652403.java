public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int x = scanner.nextInt(), i = 0;
        while (0 < x) x -= ++i;
        System.out.println(i);
    }
}