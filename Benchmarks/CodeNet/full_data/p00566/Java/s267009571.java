import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(), m[][] = new int[h][w], min = Integer.MAX_VALUE;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int sum = 0;
                for (int k = 0; k < h; k++) {
                    for (int l = 0; l < w; l++) {
                        sum += Math.min(Math.abs(i - k), Math.abs(j - l)) * m[k][l];
                    }
                }
                min = Math.min(min, sum);
            }
        }
        System.out.println(min);
    }
}
