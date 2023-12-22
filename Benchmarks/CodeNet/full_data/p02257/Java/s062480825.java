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

        sc.close();

        for (int num : array) {
            boolean check = true;
            for (int j = 2; j<num; j++) {
                if (num % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                prime++;
            }
        }

        System.out.println(prime);

    }
}
