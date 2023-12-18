import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int[] a = new int[n];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(stdIn.next());
            if (a[i] % 2 == 0 && (a[i] % 3 != 0 && a[i] % 5 != 0)) {
                flag = true;
            }
        }

        if (flag) {
            System.out.println("DENIED");
        } else {
            System.out.println("APPROVED");
        }
    }
}