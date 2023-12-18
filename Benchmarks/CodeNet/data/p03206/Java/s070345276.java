package atcode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author kouki
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        if (D==25) {
            System.out.println("Christmas");
        }else if (D==24) {
            System.out.println("Christmas Eve");
        }else if (D==23) {
            System.out.println("Christmas Eve Eve");
        }else if (D==22) {
            System.out.println("Christmas Eve Eve Eve");
        }
    }
}