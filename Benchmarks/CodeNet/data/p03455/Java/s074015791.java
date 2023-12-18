

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blulogix
 */
public class Main {
    public static void main(String[] args)throws Exception {
       Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        
        if((a*b)%2==0)
            System.out.println("Even");
        else
             System.out.println("Odd");
    }
}
