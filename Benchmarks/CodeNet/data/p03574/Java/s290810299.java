import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    String[][] inputArray;
    int[][] ansArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        inputArray = new String[H+2][W+2];
        ansArray = new int[H+2][W+2];

        for(int i=0; i<=H+1; i++){
            if(i == 0 || i == H+1){
                for(int j=0; j<=W+1; j++){
                    inputArray[i][j] = "w";
                }
            } else {
                char[] input = sc.next().toCharArray();
                for(int j=0; j<=W+1; j++){
                    if(j == 0 || j == W+1){
                        inputArray[i][j] = "w";
                    }
                    else {
                        inputArray[i][j] = String.valueOf(input[j-1]);
                    }
                }
            }
        }


        for(int i=1; i<=H; i++){
            for(int j=1; j<=W; j++){
                int count = -1;
                if(inputArray[i][j].equals(".")){
                    count = checkNbOfBomb(i, j);
                }
                if(count == -1){
                    if(j == W){
                        System.out.println("#");
                    } else {
                        System.out.print("#");
                    }
                } else {
                    if(j == W){
                        System.out.println(count);
                    } else {
                        System.out.print(count);
                    }
                }
            }
        }
    }

    int checkNbOfBomb(int i, int j) {
        int count = 0;
        if (inputArray[i+1][j].equals("#")) {
            count++;
        }

        if(inputArray[i+1][j+1].equals("#")){
            count++;
        }

        if(inputArray[i][j+1].equals("#")){
            count++;
        }

        if(inputArray[i-1][j+1].equals("#")){
            count++;
        }

        if(inputArray[i-1][j].equals("#")){
            count++;
        }

        if(inputArray[i-1][j-1].equals("#")){
            count++;
        }

        if(inputArray[i][j-1].equals("#")){
            count++;
        }

        if(inputArray[i+1][j-1].equals("#")){
            count++;
        }

        return count;
    }
}