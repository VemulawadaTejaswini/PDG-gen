package RegularContest084;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Ryuta on 2017/11/07.
 */
public class SnukeFestival {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] altars = new int[3][n];
        int count = 0;

        // 読み込み
        for(int i = 0;i<3;i++){
            for (int j = 0; j < n; j++) {
                altars[i][j] = sc.nextInt();
            }
        }

        // ソート
        for(int[] alter:altars){
            Arrays.sort(alter);
           // System.out.println(alter[0]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(altars[0][i] < altars[1][j] ){
                    for (int k = 0; k < n; k++) {
                        if(altars[1][j] < altars[2][k]){
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);

    }
}
