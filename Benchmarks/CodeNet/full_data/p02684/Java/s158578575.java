package codeplay;


import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;




public class Main {
    public static void main(String[] args){


        //初期設定
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> X = new ArrayList<Integer>();
        String x = scan.next();
        String[] sx = x.split(" +");
        int numm = Integer.parseInt(x);
        int p=0;
        do{
        X.add(numm);
        p = p + 1;
        }
        while(p <2);

        int N = X.get(0);
        int K = X.get(1);
      


        Scanner scan2 = new Scanner(System.in);

        ArrayList<Integer> A = new ArrayList<Integer>();
        int q = 0;
        do {
            String input = scan2.next();
            String[] sa = input.split(" +");
            int num = Integer.parseInt(input);


                A.add(num);
                q = q + 1;
            }
            while (q < N);
            System.out.println(A);




        //計算
        int j = 1;
        for (int cnt = 1; cnt <= K; cnt++) {

            j = A.get(j+1);
            System.out.println(j);
            System.out.println("K=:"+cnt);
        }

        System.out.println(j);

    }

}

