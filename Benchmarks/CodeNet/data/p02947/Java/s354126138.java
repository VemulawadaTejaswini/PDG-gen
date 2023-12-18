import java.util.*;

public class Main {

    public static void printX(int n){

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力

        int N = sc.nextInt();

        int[] list = new int[N];

        long c = 0;
        int sum = 0;

        for (int i = 0; i < N; i++){
            char[] chars = sc.next().toCharArray();
            sum = 0;
            for(int k = 0; k  < 10; k++){
                sum += chars[k];
            }
            list[i] = sum;
            for(int j = i - 1 ; j >= 0; j--){
                if(list[i] == list[j]){
                    c++;
                }
            }
        }


        System.out.println(c);

    }
}