import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        if (Math.abs(a[1] - a[0]) <= a[3] && Math.abs(a[2] - a[1]) <= a[3]
            || Math.abs(a[2] - a[0]) <= a[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
