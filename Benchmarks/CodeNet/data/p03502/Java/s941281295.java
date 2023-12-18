import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHarshad(n) ? "Yes" : "No");
    }

    private static boolean isHarshad(int n) {
        char[] c = String.valueOf(n).toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += Integer.valueOf(String.valueOf(c[i]));
        }
        return n % sum == 0;
    }
}
