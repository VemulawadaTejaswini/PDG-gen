package abc105_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N枚の AtCoder せんべい
        int K = sc.nextInt(); //K人の AtCoder 参加者
        if (N % K == 0)
            System.out.println(0);
        else
            System.out.println(1);
        sc.close();
    }
    
}
