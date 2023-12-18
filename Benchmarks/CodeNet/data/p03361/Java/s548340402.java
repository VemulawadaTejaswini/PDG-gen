import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] square = new int[h+2][w+2];

        for (int i=1;i<h+1;i++){
            for (int j=1;j<w+1;j++){
                if (sc.next().equals("#")){
                    square[i][j] = 1;
                }
            }
        }

        for (int i=1; i<h+1; i++){
            for (int j=1; j<w+1; j++){
                int sum = square[i-1][j] + square[i+1][j] + square[i][j-1] + square[i][j+1];
                if (sum < 0){
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
}