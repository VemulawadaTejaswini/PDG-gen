import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] garbege = new int[N];
        int[] garbege2 = new int[N];
        for(int i = 0; i < N; i++)
            garbege2[i] = sc.nextInt();

        for(int i = 0; i < N; i++)
            garbege[i] = garbege2[N - i - 1];

        int have = 1;
        int index = 1;

        int cost = garbege[0];
        cost += X;

        while(index < N){
            if((garbege[index - 1] - garbege[index]) * (have + 1) * (have + 1) < garbege[index - 1] * (have + 1) * (have + 1) + garbege[index] + X){
                cost += (garbege[index - 1] - garbege[index]) * (have + 1) * (have + 1);
                cost += X;
                have++;
            }
            else{
                cost += garbege[index - 1] * (have + 1) * (have + 1) + garbege[index] + X;
                cost += X;
                have = 0;
            }

            index++;
        }

        cost += garbege[index - 1] * (have + 1) * (have + 1);
        cost += X;

        System.out.println(cost);
    }
}