
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
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        boolean state = true;
        for (int i = 0; i < m; i++) {
            int l = input.nextInt();
            int r = input.nextInt();
            if ((r -l) != input.nextInt()) {
                state = false;
                break;
            }
        }
        if (state) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
