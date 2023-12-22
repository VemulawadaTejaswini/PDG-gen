import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int noDataSet = sc.nextInt();

        for (int i = 0; i < noDataSet; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}