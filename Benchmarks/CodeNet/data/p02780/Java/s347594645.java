import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int diceN = sc.nextInt();
        final int doN = sc.nextInt();
        final int diceValue[] = new int[diceN];
        double dicePoint[] = new double[diceN];
        for (int i = 0; i < diceN; i++) {
            diceValue[i] = sc.nextInt();
            dicePoint[i] = cal(diceValue[i]);
        }
        double sum = 0, max = 0;
        for (int i = 0; i + doN <= diceN; i++) {
            sum = 0;
            for (int j = 0; j < doN; j++) {
                sum += dicePoint[i + j];
            }
            if(sum > max)
                max = sum;
        }
        System.out.println(max);
    }

    static double cal(int value) {
        double res = 0;
        for (int i = 1; i <= value; i++) {
            res += i;
        }
        return res / (double)(value);
    }
}