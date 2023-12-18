package app.Begginer.No152.C;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];
        int count = 1;
        int flag = 0;

        for (int i = 0; i < N; i++){
            P[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            flag = 0;
            for(int j = 0; j < i; j++){
                if(P[i] > P[j]) {
                    flag = 0;
                }else if(P[i] <= P[j]){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                count += 1;
            }
        }
        System.out.println(count);
    }
}