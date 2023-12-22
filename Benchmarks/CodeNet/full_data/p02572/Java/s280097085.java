import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        long K = Math.round(Math.pow(10, 9) + 7);
        long product = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                // System.out.println(Arrays.toString(new Integer[] {i, j}));
                product += (Long.parseLong(s[i]) * Long.parseLong(s[j])) % K;
            }
        }
        System.out.println(Math.round(product));
    }
}