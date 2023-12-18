import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] used1 = new int[n];
        int[] used2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt() - 1;
        }
        for (int i = 0; i < n; i++) {
            array2[i] = sc.nextInt() - 1;
        }
        
        int count1 = 0;
        for (int i = 0; i < n-1; i++) {
            int tmp = 0;
            for (int j = 0; j <= array1[i]; j++) {
                if (used1[j] == 0) {
                    tmp++;
                }
            }
            count1 += tmp * fact(n - 1 - i);
            used1[array1[i]] = 1;
        }
        
        int count2 = 0;
        for (int i = 0; i < n-1; i++) {
            int tmp = 0;
            for (int j = 0; j <= array2[i]; j++) {
                if (used2[j] == 0) {
                    tmp++;
                }
            }
            count2 += tmp * fact(n - 1 - i);
            used2[array2[i]] = 1;
        }        
        System.out.println(Math.abs(count1 - count2));
    }
    
    public static int fact(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer = answer * i;
        }
        
        return answer;
    }
}
