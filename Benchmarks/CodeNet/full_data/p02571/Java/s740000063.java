package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Sを入力してください");
        String S = scn.next();
        String[] strArraySubS = S.split("");

        System.out.println("Tを入力してください");
        String T = scn.next();
        String[] strArraySubT = T.split("");


        for (int i = 0; i < strArraySubS.length; i++) {
            System.out.println("Sの" + i + "の番目：" + strArraySubS[i]);
        }


        for (int i = 0; i < strArraySubT.length; i++) {
            System.out.println("Tの" + i + "の番目：" + strArraySubT[i]);
        }

    }
}
