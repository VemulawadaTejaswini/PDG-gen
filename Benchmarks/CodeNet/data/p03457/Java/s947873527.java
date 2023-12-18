
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rn-sshawish
 */
public class AtCOder86C {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = 0, x = 0, y = 0;
        boolean state = true;
        for (int i = 0; i < n; i++) {
            int t1 = input.nextInt();
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int distanceDiff;

                int fiffY = Math.abs(x - x1);
//                if (fiffY != 0 && x != 0&& x1 != 0) {
//                    fiffY ++;
//                }
                int fiffX = Math.abs(y - y1);
//                if (fiffX != 0 && y != 0&& y1 != 0) {
//                    fiffX ++;
//                }
                distanceDiff = fiffX + fiffY;
            
            int timeDiff = t1 - t;
            if (distanceDiff <= timeDiff) {
                t = t1;
                x = x1;
                y = y1;
            } else {
                state = false;
                break;
            }
        }
        if (state) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

