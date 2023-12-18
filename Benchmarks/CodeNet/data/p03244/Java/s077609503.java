import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] histOdd = new int[100000];
        int[] histEven = new int[100000];
        for (int i = 0; i<n; i++) {
            int t = sc.nextInt();
            if (i%2==0) {
                histEven[t]++;
            }
            else {
                histOdd[t]++;
            }
        }

        int oddMax = 0;
        int omValue = 0;
        int oddSecondMax = 0;
      
        int evenMax = 0;
        int emValue = 0;
        int evenSecondMax = 0;
        for (int i = 0; i<100000; i++) {
            if (evenMax < histEven[i]) {
                emValue = i;
                evenMax = histEven[i];
            }
            if (oddMax < histOdd[i]) {
                omValue = i;
                oddMax = histOdd[i];
            }
        }
      
         for (int i = 0; i<100000; i++) {
            if (evenSecondMax < histEven[i] && emValue != i) {
                evenSecondMax = histEven[i];
            }
            if (oddSecondMax < histOdd[i] && omValue != i) {
                oddSecondMax = histOdd[i];
            }
        }        
      
        if (emValue == omValue) {
        	oddMax = Math.max(evenSecondMax, oddSecondMax);
        }

        int result = n - oddMax - evenMax; 
        System.out.println(result);
    }
}