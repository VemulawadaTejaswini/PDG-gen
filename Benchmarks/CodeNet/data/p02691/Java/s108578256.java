import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer a[] = new Integer[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int count = 0;
        for(int j=1; j<n; j++){
            for(int k=0; k<j; k++){
                if( j-k == a[j]+a[k] ){
                    count++;
                }
            }
        }

        System.out.println( count );

    }
}