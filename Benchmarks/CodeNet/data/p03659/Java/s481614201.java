public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), fd = 0, min = -1;
        int[] a = new int[n], d = new int[n - 1];
        for (int i = 0; i < n; i++)
            fd += a[i] = scanner.nextInt();
        for (int i = 0; i < n - 1; i++)
            min = Math.min(d[i] = Math.abs(fd -= a[i] * 2), min == -1 ? d[i] : min);
        System.out.println(min);
    }
}