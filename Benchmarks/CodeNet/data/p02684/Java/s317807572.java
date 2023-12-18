import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer a[] = new Integer[n];
 
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Integer tport[] = new Integer[k+1];
        tport[0] = 1;
        for(int j=0; j<k; j++){
            tport[j+1] = a[ tport[j]-1 ];
        }

        System.out.println( tport[k] );

    }
}