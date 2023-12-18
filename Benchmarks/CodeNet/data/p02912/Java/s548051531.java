import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if (n == 1) {
            double num = sc.nextDouble();
            while (m-- > 0) {
                num /= 2;
            }
            
            long answer = (long)Math.floor(num);
            
            System.out.println(answer);
            return;
        }
        
        double first = -1;
        int firstIndex = -1;
        double second = -2;
        int secondIndex = -1;
        
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextDouble();
        }
        
        Arrays.sort(array);
        
        firstIndex = n - 1;
        first = array[n - 1];
        secondIndex = firstIndex - 1;
        second = array[firstIndex - 1];
        int pos = 0;
        while (m-- > 0) {
            int tmp = 0;
            array[firstIndex] /= 2;
            double a = array[firstIndex];
            double b = array[firstIndex - 1];
            
            if (a >= b) {
                if (second >= a) {
                    tmp = firstIndex;
                    firstIndex = secondIndex;
                    secondIndex = tmp;
                    second = array[secondIndex];
                    pos = 0;
                } else {
                    secondIndex = firstIndex - 1;
                    second = array[secondIndex];
                    pos  = 1;
                }
            } else {
                if (b > second) {
                    firstIndex = firstIndex - 1;
                    pos = 2;
                } else {
                    tmp = secondIndex;
                    secondIndex = firstIndex;
                    second = array[secondIndex];
                    firstIndex = tmp;
                    pos = 3;
                }
            }
            
            //System.out.println(Arrays.toString(array));
            //System.out.println(pos);
        }
        
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long)Math.floor(array[i]);
        }
        
        System.out.println(sum);
    }
}
