import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int diceN = sc.nextInt();
        final int doN = sc.nextInt();
        double dicePoint[] = new double[diceN];
        double sum = 0, max = 0;
        int cnt = 0;
        for (int i = 0; i < diceN; i++) {
            dicePoint[i] = cal(sc.nextInt());
            sum += dicePoint[i];
            if(cnt >= doN){
                sum -= dicePoint[i - doN];
                if(sum > max)
                    max = sum;
            }else
                cnt++;
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