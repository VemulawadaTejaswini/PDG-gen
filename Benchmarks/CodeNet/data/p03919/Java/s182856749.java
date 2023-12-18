import java.util.*;

import static java.lang.String.format;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int H, W;
        String[][] map = new String[26][26];

        H = scanner.nextInt();
        W = scanner.nextInt();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                map[i][j] = scanner.next();
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if("snuke".equals(map[i][j])){
                    System.out.println((char)('A' + j) + "" + (i+1) );
                };
            }
            //System.out.println();
        }

    }


}


