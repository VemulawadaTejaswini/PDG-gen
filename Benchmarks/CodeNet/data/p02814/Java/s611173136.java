import java.util.*;

public class Main {
    static int powerTwo(int k) {
        int counter = 0;
        while(k % 2 == 0) {
            counter++;
            k = k/2;
        }
        return counter;
    }
    static int generateGCD(int a, int b) {
        if(a % b == 0) {
            return b;
        } else {
            return generateGCD(b, a % b);
        }
    }
    
    static int generateLCM(int[] numbers) {
        int currentLCM = 0;
        for(int i = 0; i < numbers.length - 1; i++) {
            int tempGCD = generateGCD(numbers[i], numbers[i+1]);
            currentLCM = numbers[i] * numbers[i+1] / tempGCD;
        }
        return currentLCM;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] numbers = new int[n];
        int[] power = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = (in.nextInt())/2;
            power[i] = powerTwo(numbers[i]);
        }
        int k = generateLCM(numbers);
        double ans = m/((double)2*k);
        boolean checkSame = true;
        int checker = power[0];
        for(int i = 0; i < n; i++) {
            if(power[i] != checker) {
                checkSame = false;
                break;
            }
        }
        if(!checkSame) {
            System.out.println(0);
        } else {
            System.out.println((int) Math.ceil(ans));
        }
    }
}
