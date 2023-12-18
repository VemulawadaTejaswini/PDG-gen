import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        if (sum < h) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        sc.close();
    }
}
