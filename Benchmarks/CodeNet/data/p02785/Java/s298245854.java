package Atcoder;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//攻撃
        int K = sc.nextInt();//必殺技
        int H[] = new int[n];//体力
        int sum = 0;

        for(int i =0; i <n; i++){
            H[i] = sc.nextInt();
        }
        Arrays.sort(H);
        if(K==0){
            for(int i =0; i <H.length; i++){
                sum += H[i];
            }
        }else {
            for (int i = 0; i < K; i++) {
                H.remove(H.length);
            }
            for (int i = 0; i < H.length; i++) {
                sum += H[i];
            }
        }
    }
}
