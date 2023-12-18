import java.util.*;
 
public class Main {
 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] dices = new int[n];
        double[] expected = new double[n];
        double max = 0;
        for(int i = 0 ; i < n ; i++){
            dices[i] = scanner.nextInt();
            expected[i] = i == 0 ? calc(dices[i]) : dices[i - 1] + calc(dices[i]);
            if((i + 1) < k){
                continue;
            }
 
            double dice = expected[i] - expected[i - k - 1];
            if(max < dice){
                max = dice;
            }
        }
        System.out.println(max);
    }
 
    static double calc (int n){
        double result = (1.0+n)/2;
//        for(int i = 1 ; i <= n ; i++){
//            result += ((double)i) * (double)(1.0d / n);
//        }
        return result;
    }
 
}