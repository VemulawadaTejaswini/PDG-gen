/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coder;

import java.util.Scanner;

/**
 *
 * @author thanhtuan
 */
class Coder {

    public static void main(String[] args) {
        // TODO code application logic here
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for(int i = 1 ; i <= input ; i ++){
            result += i;
        }
        System.out.print(result);
    }
    
}
