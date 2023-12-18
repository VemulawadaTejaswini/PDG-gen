import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int H = Integer.parseInt(scan.next());
        int W = Integer.parseInt(scan.next());
        char[][] s = new char[H][W];

        System.out.println();

        String h;
        for(int i = 0; i < H; i++){
            h = scan.next();
            for(int j = 0; j < W; j++){
                s[i][j] = h.charAt(j);
            }
        }


        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++) {
                if ( 0   <= i-1 && s[i-1][j] == '#') continue;
                if ( i+1 <= W-1 && s[i+1][j] == '#') continue;
                if ( 0   <= j-1 && s[i][j-1] == '#') continue;
                if ( j+1 <= H-1 && s[i][j+1] == '#') continue;
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        return;
    }
}