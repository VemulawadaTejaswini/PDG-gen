
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
        long sum =0;
        for (int i = 1; i <= n; i++) {
            if (checkDigitSum(i, a, b)) {
                sum+= i;
            }
        }
        System.out.println(sum);
    }
    
    public static boolean checkDigitSum (int number, int a, int b){
        int sum = 0;
            while (number > 9) {
                sum+= number % 10;
                number = number / 10;
            }
            if (number > 0) {
                sum+= number;
            }
            if (sum >=a  && sum <= b) {
                return true;
            }else{
                return false;
            }
    }
}
