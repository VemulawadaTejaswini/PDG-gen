
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
        int left = input.nextInt() + input.nextInt();
        int right =  input.nextInt() + input.nextInt();
        if (left > right) {
            System.out.println("Left");
        }else if (left < right) {
            System.out.println("Right");
        }else{
            System.out.println("Balanced");
        }
    }
}
