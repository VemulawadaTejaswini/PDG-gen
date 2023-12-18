package codeplay;


import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;




public class Main<output> {
    public static void main(String[] args){


        //初期設定
        Scanner scan = new Scanner(System.in);
       
        int N = scan.nextInt();
        long K = scan.nextLong();
    

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

