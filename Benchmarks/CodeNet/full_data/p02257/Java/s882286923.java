import java.util.*;

/**
 * C
 */
public class Main {
    public static void main(String[] args) {
        
        int prime = 0;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        
        IN : for (int num : array) {
            for (int j = 2; j<num; j++) {
                if (num % j == 0) {
                    continue IN;
                }
            }
            prime++;
        }

        System.out.println(prime);

    }
}
