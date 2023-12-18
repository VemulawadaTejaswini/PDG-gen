//package Atcoder133;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        List<List<Double>> list = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
            List<Double> list2 = new ArrayList<>();
            for(int j = 0 ; j< D ; j++){
                list2.add(scanner.nextDouble());
            }
            list.add(list2);
        }
        int squareNumCount = 0;
        for(int i = 0 ; i< N ; i++){
            for(int j = N-1; j> i ; j--){
                double squaredDistanse = calSquaredDistanse(list.get(i),list.get(j));
                if(isSquareNum(squaredDistanse)){
                    squareNumCount++;
                }
            }
        }
        System.out.println(squareNumCount);
    }

    private static boolean isSquareNum(double squaredDistanse) {
        for(int i=1; i<=Math.sqrt(squaredDistanse); i++){
            if(i*i == squaredDistanse) return true;
        }
        return false;
    }

    private static double calSquaredDistanse(List<Double> integers, List<Double> integers1) {
        double sum = 0;
        for(int i=0; i < integers.size(); i++){
            double d = integers.get(i) - integers1.get(i);
//            sum = d>0 ? sum+d*d : sum-d;
            sum+=d*d;
        }
        return sum;
    }
}


//15hunn
