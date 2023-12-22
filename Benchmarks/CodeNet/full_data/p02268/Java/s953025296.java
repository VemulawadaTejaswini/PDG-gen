import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        for(int i = 0; i < n; i++){
            S[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] T = new int[q];
        for(int i = 0; i < q; i++){
            T[i] = sc.nextInt();
        }
        Arrays.sort(T);
        int Sum = 0;
        for(int i = 0; i < q; i++){
            for(int j = 0; j < n; j++){
                if(S[j] == T[i]){
                    Sum++;
                    break;
                }else if(S[j] > T[i]){
                    break;
                }
            }
        }
        System.out.println(Sum);
        sc.close();
    }
}
