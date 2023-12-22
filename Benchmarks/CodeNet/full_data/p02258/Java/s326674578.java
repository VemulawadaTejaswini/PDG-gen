package PRC1122.Practice;

import java.util.Scanner;

/**
 * Created by sd on 2016/11/22.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ar[] = new int[N];
        for(int i=0; i<N; i++){
            ar[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE, i_min = 0;
        for(int i=0; i<N-1; i++){
            if(min > ar[i]){
                min = ar[i];
                i_min = i;
            }
        }

        int max = Integer.MIN_VALUE, i_max = 0;
        for(int i=i_min+1; i<N; i++){
            if(max < ar[i]){
                max = ar[i];
                i_max = i;
            }
        }
        System.out.printf("%d\n", max - min);

    }

}