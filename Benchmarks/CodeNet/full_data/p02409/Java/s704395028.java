import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][][] house = new int[4][3][10];
        int i, j, k;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 10; k++) {
                    house[i][j][k] = 0;
                }
            }
        }
        int n = Integer.parseInt(br.readLine());
        String[] input;
        int b, f, r ,v;
        for (i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            b = Integer.parseInt(input[0]) - 1;
            f = Integer.parseInt(input[1]) - 1;
            r = Integer.parseInt(input[2]) - 1;
            v = Integer.parseInt(input[3]);
            house[b][f][r] += v;
        }
        String output;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                output = "";
                for (k = 0; k < 10; k++) {
                    output += " " + house[i][j][k];
                }
                System.out.println(output);
            }
            if (i != 3) System.out.println("####################");
        }
    }
}