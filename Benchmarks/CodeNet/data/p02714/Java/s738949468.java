import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long sum = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String rgb = scanner.next();
        scanner.close();
        for (int i = 1; i <= num; i++) {
            for (int j = i + 1; j <= num; j++) {
                for (int k = j + 1; k <= num; k++) {
                    if (j - i != k - j && rgb.charAt(i-1) != rgb.charAt(j-1) && rgb.charAt(i-1) != rgb.charAt(k-1) && rgb.charAt(k-1) != rgb.charAt(j-1)) {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}