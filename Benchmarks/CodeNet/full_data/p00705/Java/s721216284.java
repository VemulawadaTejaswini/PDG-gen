import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kosuke abe on 2014/10/29.
 */
public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N, Q;
        int[] date_info = new int[101];
        while(true){
            int result = 0;
            Fill(date_info, 0);

            N = scan.nextInt();
            Q = scan.nextInt();
            if(N == 0 && Q == 0){
                break;
            }
            Count(date_info, N);
            System.out.println(Result(date_info, result, Q));
        }
    }

    static void Fill(int[] list, int number){
        for(int i=0;i<101; i++){
            list[i] = number;
        }
    }

    static void Count(int[] list, int member){
        for(int i=0;i < member;i++){
            int day = scan.nextInt();
            for(int j=0; j<day;j++){
                list[scan.nextInt()] += 1;
            }
        }
    }

    static int Result(int[] list,int result,int min){
        for(int i=1;i<101;i++){
            if(list[i] >= min && list[i] > list[result]){
                result = i;
            }
        }
        return result;
    }
}