import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < ty - sy; i++) {
            sb.append("U");
        }
        for(int i = 0 ; i < tx - sx; i++) {
            sb.append("R");
        }
        for(int i = 0 ; i < ty - sy; i++) {
            sb.append("D");
        }
        for(int i = 0 ; i < tx - sx; i++) {
            sb.append("L");
        }

        sb.append("L");
        for(int i = 0 ; i < ty - sy + 1; i++) {
            sb.append("U");
        }
        for(int i = 0 ; i < tx - sx + 1; i++) {
            sb.append("R");
        }
        sb.append("D");

        sb.append("R");
        for(int i = 0 ; i < ty - sy + 1; i++) {
            sb.append("D");
        }
        for(int i = 0 ; i < tx - sx + 1; i++) {
            sb.append("L");
        }
        sb.append("U");

        System.out.println(sb.toString());
    }
}