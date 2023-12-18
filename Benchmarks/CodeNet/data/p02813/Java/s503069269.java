import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = s.nextInt();
        }
        int rank1 = findRank(p,n);

        int rank2 = findRank(q,n);
        System.out.println(Math.abs(rank1-rank2));

    }
    static int findRank(int [] array, int length){
        int factorial = 1;
        for(int i = 2; i<=length; i++){
            factorial *= i;
        }
        int rc;
        int m = factorial;
        int rank = 1;
        for(int i = 0; i<length; i++){
            m = m/(length-i);
            rc = 0;
            for(int j = i+1; j<= length-1; j++){
                if(array[j] < array[i]){
                    rc++;
                }
            }
            rank = rank + (rc * m);
        }
        return rank;
    }
}
