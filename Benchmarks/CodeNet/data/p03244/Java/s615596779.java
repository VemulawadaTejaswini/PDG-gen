import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] O = new int[N/2];
        int[] E = new int[N/2];
        for(int i = 0; i < N; i++){
            if(i % 2 == 0){
                O[i/2] = sc.nextInt();
            }else{
                E[i/2] = sc.nextInt();
            }
        }
        sc.close();
        Arrays.sort(O);
        Arrays.sort(E);
        int[][] oMax = new int[N/2][2];
        int t = 0;
        int tCount = 0;
        int idx = 0;
        for(int j = 0; j < N/2; j++){
            if(t == 0){
                t = O[j];
                tCount = 1;
            }else if(O[j] != t){
                oMax[idx][0] = tCount;
                oMax[idx][1] = t;
                idx++;
                t = O[j];
                tCount = 1;
            }else{
                tCount++;
            }
        }
        oMax[idx][0] = tCount;
        oMax[idx][1] = t;

        int[][] eMax = new int[N/2][2];
        t = 0;
        tCount = 0;
        idx = 0;
        for(int j = 0; j < N/2; j++){
            if(t == 0){
                t = E[j];
                tCount = 1;
            }else if(E[j] != t){
                eMax[idx][0] = tCount;
                eMax[idx][1] = t;
                idx++;
                t = E[j];
                tCount = 1;
            }else{
                tCount++;
            }
        }
        eMax[idx][0] = tCount;
        eMax[idx][1] = t;
        Arrays.sort(oMax, (x, y) -> y[0]-x[0]);
        Arrays.sort(eMax, (x, y) -> y[0]-x[0]);

        if(oMax[0][1] != eMax[0][1]){ System.out.println(N - oMax[0][0] - eMax[0][0]);}
        else if(oMax[0][0] >= eMax[0][0]){ System.out.println(N - oMax[0][0] - eMax[1][0]);}
        else{ System.out.println(N - oMax[1][0] - eMax[0][0]);}

    }

}
