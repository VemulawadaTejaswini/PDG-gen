/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc043d;

import java.util.Scanner;

/**
 *
 * @author c0115334
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strings = scan.nextLine().split("");
        int start = -1;
        int end = -1;
        for (int i = 0; i < strings.length - 1; i++) {
            if (strings[i].equals(strings[i + 1])) {
                start = i + 1;
                end = i + 2;
                break;
            }
            try{
            if (strings[i].equals(strings[i + 2])) {
                start = i + 1;
                end = i + 3;
                break;
            }
            }catch(Exception e){
                
            }

        }
        System.out.println(start + " " + end);
    }
}
