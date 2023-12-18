import java.util.*;

class Main{
    public static void main(String[] args){
        // 入力受付
        Scanner sc = new Scanner(System.in);    //scanner
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // 計算
        if( (A+D-1)/D >= (C+B-1)/B)
            System.out.println("Yes");
        else
            System.out.println("Yes");
    }
}