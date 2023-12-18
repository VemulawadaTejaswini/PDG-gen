import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        Integer a[] = new Integer[n];
 
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int from = 1;
        int to   = 0;
        for(long j=0; j<k; j++){
            to = a[ from-1 ];
        }

        System.out.println( to );

    }
}