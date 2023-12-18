public class Main {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();
        int[] arrn = new int[n];

        for (int i = 0; i < n - 1; i++) {
            arrn[sc.nextInt() - 1]++;
        }

        for (int i : arrn) {
            System.out.println(i);
        }
    }

}