import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long ans;

        if (k % 2 == 0) {
            int kosuOf0 = n / k;
            int kosuOf2 = (n % k < k / 2) ? n / k : n / k + 1;

            ans = (int) (Math.pow(kosuOf0, 3) + Math.pow(kosuOf2, 3));

        } else {
            int kosu = n / k;

            ans = (int) Math.pow(kosu, 3);

        }

        System.out.println(ans);
    }
}
