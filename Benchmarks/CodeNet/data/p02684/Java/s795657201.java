package codeplay;


import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;




public class Teleporter<output> {
    public static void main(String[] args){


        //初期設定
        Scanner scan = new Scanner(System.in);
       // System.out.println("Nを入力してください");
        int N = scan.nextInt();
      // System.out.println("kを入力してください");
        long K = scan.nextLong();
       // System.out.println("Aを入力してください");

        int i = 1;
        ArrayList<Integer> A = new ArrayList<Integer>();
        do {
            String input = scan.next();
            String[] sa = input.split(" +");
            int num = Integer.parseInt(input);
            A.add(num);
            //System.out.println(A);

            i = i + 1;
        }
        while (i <= N);


        /*初期設定
        Scanner scan = new Scanner(System.in);
        int i = 1;
        ArrayList<Integer> X = new ArrayList<Integer>();
        do {
            String x = scan.next();
            String[] sx = x.split(" +");
            int num = Integer.parseInt(x);
            X.add(num);
           // int N = X.get(0);
            //int K = X.get(1);
            System.out.print(X.get(0));
            i = i + 1;
        }
        while(i <= 2);

         */




        //計算
        int j = 1;
        for (int cnt = 1; cnt <= K; cnt++) {

            j = A.get(j-1);
           // System.out.println(j);
           // System.out.println("K=:"+cnt);
        }

        System.out.println(j);




    }




}

