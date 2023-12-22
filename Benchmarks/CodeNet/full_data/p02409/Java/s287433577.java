import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][][] count = new int[4][3][10];

        for (int m=0; m<n; m++) {
            int b = scanner.nextInt();
            int f = scanner.nextInt();
            int r = scanner.nextInt();
            int v = scanner.nextInt();
            count[b-1][f-1][r-1] += v;
        }
        for (int b=0; b<4; b++){
            for (int f=0; f<3; f++){
                StringBuilder sb = new StringBuilder();
                for (int r=0; r<10; r++){
                    sb.append(" " + count[b][f][r]);
                }
                System.out.println(sb);
            }
            if (b != 3) System.out.println("####################");
        }
    }
}

