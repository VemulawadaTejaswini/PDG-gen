import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] price = new int[n];
        int i, j;
        int max = (int) -Math.pow(10, 9);

        for (i = 0; i < n; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }
        for (i = 0; i < n-1; i++) {
            for (j = i+1; j < n; j++) {
                if (price[j] - price[i] > max) {
                    max = price[j] - price[i];
                }
            }
        }
        System.out.println(max);
    }
}