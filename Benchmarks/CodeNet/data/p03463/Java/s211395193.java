
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
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        
        if (a == 1 && b == n) {
            System.out.println("Borys");
            return;
        }
        
        int diff = Math.abs(a - b) -1;
        if (diff % 2 != 0) {
            System.out.println("Alice");
        }else{
        System.out.println("Borys");
        }
        
    }
}
