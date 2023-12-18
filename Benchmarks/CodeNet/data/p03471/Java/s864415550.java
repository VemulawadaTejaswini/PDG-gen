

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int Y = sc.nextInt();
        int sum = 0;
        int man = 0;
        int gosen = 0;
        int sen = 0;
        man = Y / 10000;
        gosen = (Y % 10000) / 5000;
        sen = (Y % 5000) / 1000;
        if(man + gosen + sen > N){
            System.out.println("-1 -1 -1");
        }else{
            System.out.print(man);
            System.out.print(" ");
            System.out.print(gosen);
            System.out.print(" ");
            System.out.print(sen);
        }


    }

}