import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[][] points = new int[n][d];
        ArrayList<Integer> stuff = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = in.nextInt();
            }
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int run = 0;
                for (int k = 0; k < d; k++) {
                    run += ((points[i][k]) - (points[j][k]))^2;
                }
                
                if (Math.sqrt(run) == Math.floor(Math.sqrt(run))) {
                    stuff.add(run);
                }
            }
        }
        
        System.out.print(stuff.size());
    }
}