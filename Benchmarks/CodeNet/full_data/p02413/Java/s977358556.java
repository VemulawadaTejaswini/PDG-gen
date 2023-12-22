import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int r = in.nextInt();
        int c = in.nextInt();

        int[] rSum = new int[c + 1];

        for (int i = 0; i < r; i++) {
            int cSum = 0;
            for (int j = 0; j < c; j++) {
                int num = in.nextInt();
                cSum += num;
                rSum[j] += num;
                rSum[c] += num;
                sb.append(num).append(" ");
            }
            sb.append(cSum).append("\n");
        }
        for (int i = 0; i < c; i++) {
            sb.append(rSum[i]).append(" ");
        }
        sb.append(rSum[c]).append("\n");

        System.out.print(sb.toString());
    }
}