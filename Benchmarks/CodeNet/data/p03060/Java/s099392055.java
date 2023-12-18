import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // スペース区切りの整数の入力
        int[] value = new int[n];
        int[] cost = new int[n];
        int[] trueValue = new int[n];
        int max = 0;

        for(int i = 0; i < n; i++){
            value[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            cost[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            trueValue[i] = value[i] - cost[i];
            if(trueValue[i] > 0){
                max += trueValue[i];
             }
        }
        System.out.println(max);
    }
}