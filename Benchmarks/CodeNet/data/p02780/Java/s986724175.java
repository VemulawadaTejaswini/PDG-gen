import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] exp = new int[n];
        int max = 0;

        for(int i = 0 ; i < n ; i++){
            exp[i] = sc.nextInt()+1;
        }

        int sum = 0;
        for(int j = 0 ; j < k ; j++){
            sum += exp[j];
        }
        max = sum;
        for(int i = 0 ; i+k-1 < n-1 ; i++){
            sum -= exp[i];
            sum += exp[i+k];
            max = Math.max(sum, max);
        }
        System.out.println((double)max/2);
    }
}