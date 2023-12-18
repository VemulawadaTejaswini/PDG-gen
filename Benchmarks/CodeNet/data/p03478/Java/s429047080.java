import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            String str = String.valueOf(i);
            long tempSum = 0;
            for (int j = 0; j < str.length(); j++) {
                tempSum += Integer.parseInt(String.valueOf(str.charAt(j)));
            }
            if (tempSum >= a && tempSum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}