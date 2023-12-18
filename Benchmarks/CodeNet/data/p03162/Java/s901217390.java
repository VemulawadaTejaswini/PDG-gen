import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] values = new int[n][3];
        for(int i = 0 ; i < n ; i++){
            values[i][0] = scan.nextInt();
            values[i][1] = scan.nextInt();
            values[i][2] = scan.nextInt();
        }

        int[][] cache = new int[n+1][3];

        for(int i = 0 ; i < n ; i++){
            cache[i+1][0] = Math.max(values[i][0]+cache[i][1], values[i][0]+cache[i][2]);
            cache[i+1][1] = Math.max(values[i][1]+cache[i][0], values[i][1]+cache[i][2]);
            cache[i+1][2] = Math.max(values[i][2]+cache[i][0], values[i][2]+cache[i][1]);
        }
        System.out.println(Math.max(Math.max(cache[n][0], cache[n][1]), cache[n][2]));
    }
}