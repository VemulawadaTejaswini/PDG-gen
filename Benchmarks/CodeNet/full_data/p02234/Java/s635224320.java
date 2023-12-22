import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    static final int MAX = 100;
    int size;
    int[] R = new int[MAX+2];
    int[][] C = new int[MAX+1][MAX+1], B = new int[MAX+1][MAX+1];
    private void solv() {
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        for (int i = 1; i <= size+1; i++) {
            R[i] = input.nextInt();
            R[i+1] = input.nextInt();
        }
        compute();
        System.out.println(C[1][size]);
    }
    
    int INFTY = (1 << 21);
    void compute(){
        for ( int i = 1; i <= size; i++ )
        for ( int j = 1; j <= size; j++ ) C[i][j] = INFTY;
        
        for ( int i = 1; i <= size; i++ ) C[i][i] = 0;
        
        for ( int j = 1; j <= size - 1; j++ ){
            for ( int i = 1; i <= size - j; i++ ){
                for ( int k = i + 1; k <= i + j; k++ ){
                    // C[i][i+j] = min( C[i][i+j], 
                    //                  C[i][k-1] + C[k][i+j] + R[i]*R[k]*R[i+j+1]);
                    int cost = C[i][k-1] + C[k][i+j] + R[i]*R[k]*R[i+j+1];
                    if ( cost < C[i][i+j] ){
                        C[i][i+j] =  cost;
                        B[i][i+j] = k;
                    }
                    
                }
            }
        }
    }
    void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
    
}

class Scanner {
    BufferedReader r;
    StreamTokenizer st;
    
    public Scanner(InputStream in) {
        r = new BufferedReader(new InputStreamReader(in));
        st = new StreamTokenizer(r);
    }
    
    public String next() {
        nextToken();
        return st.sval;
    }
    
    public Integer nextInt() {
        nextToken();
        return (int)st.nval;
    }
    
    private int nextToken() {
        int token = st.TT_EOF;
        try {
            token = st.nextToken();
        } catch (IOException e) {
        }
        return token;
    }
}