//https://atcoder.jp/contests/abc127/tasks/abc127_b

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        for (int i=0;i<10;i++){
            x = r*x-D;
            System.out.println(x);
        }
    }
}