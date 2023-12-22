import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int n = sc.nextInt();
        int[] a = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
        }
        sc.close();
        Sort s = new Sort( n, a );
        s.bubblesort();
        s.printA();
        System.out.println( s.count );
    }
}

class Sort {
    public int N;
    public int[] A;
    public int count;

    Sort( int N, int[] A ){
        this.N = N;
        this.A = A;
        this.count = 0;
    }

    public void bubblesort(){
        int tmp = 0;
        boolean flag = true;
        while( flag ){
            flag = false;
            for( int j = this.N-1; j > 0 ; j-- ){
                if( this.A[j] < this.A[j - 1] ){
                    tmp = this.A[j];
                    this.A[j] = this.A[j - 1];
                    this.A[j -1] = tmp;
                    flag = true;
                    this.count++;
                }
            }
        }
    }

    public void printA(){
        for( int i = 0; i < this.N; i++ ){
            System.out.print( this.A[i] );
            if( i != this.N - 1 ){
                System.out.print(  " " );
            }
        }
        System.out.println("");
    }
}
