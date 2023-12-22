import java.util.*;

/**
 * D
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max_v, min_v;
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        max_v = array[1] - array[0];
        min_v = array[0];

        for(int i=1; i<n; i++) {

            if(array[i] - min_v > max_v) {
                max_v = array[i] - min_v;
            }

            if(array[i] < min_v) {
                min_v = array[i];
            }

        }

        System.out.println(max_v);

    }
}
