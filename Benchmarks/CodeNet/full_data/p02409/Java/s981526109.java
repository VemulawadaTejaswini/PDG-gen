import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        int num = Integer.parseInt(line);
        int[][][] numAry = new int[4][3][10];
        
        //????????????
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    numAry[i][j][k] = 0;
                }
            }
        }
        
        //input?????£??\
        for (int i = 0; i < num; i ++) {
            String[] aryInput = br.readLine().split(" ");
            
            int a = Integer.parseInt(aryInput[0]);
            int b = Integer.parseInt(aryInput[1]);
            int c = Integer.parseInt(aryInput[2]);
            
            numAry[a - 1][b - 1][c - 1] += Integer.parseInt(aryInput[3]);
        }
        
        //??????
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" ");
                    System.out.print(numAry[i][j][k]);
                }
                System.out.println();
            }
            if(i != 3){
                System.out.println("####################");
            }
        }
    }
}