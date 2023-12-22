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

        for(int i=0; i<=n-1; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        for(int num : array) {
            int check = 0;
            for(int j=1; j<=num; j++) {
                if(num%j == 0) {
                    check++;
                }
            }
            if(check == 2) {
                prime++;
            }
        }

        System.out.println(prime);

    }
}
