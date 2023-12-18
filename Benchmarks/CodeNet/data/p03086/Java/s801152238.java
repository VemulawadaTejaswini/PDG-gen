/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.atcoder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String AtCoder = sc.next();
        String[] text = AtCoder.split("");
        int count = 0;
        int answer = 0;
        for (int i = 0; i < AtCoder.length(); i++) {
            if (text[i].equals("A") || text[i].equals("C") || text[i].equals("G") || text[i].equals("T")) {
                count++;
            } else {
                if (answer < count) {
                    answer = count;
                }
                count = 0;
            }
        }

        System.out.print(answer);
    }

}
