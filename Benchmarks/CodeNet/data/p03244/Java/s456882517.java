import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] V = new int[N];
        for(int i = 0; i < N; i++){
            V[i] = sc.nextInt();
        }
        
        int[][] values0 = new int[(int)1e5+1][2];
        int[][] values1 = new int[(int)1e5+1][2];        
        
        for(int i = 0; i < N; i++){
            if( i % 2 == 0){
                values0[V[i]][0] = V[i];
                values0[V[i]][1]++;
            } else {
                values1[V[i]][0] = V[i];
                values1[V[i]][1]++;
            }
        }
        
        Arrays.sort(values0, (a, b) -> Integer.compare(b[1], a[1]) );
        Arrays.sort(values1, (a, b) -> Integer.compare(b[1], a[1]) ); 
        
        if( values0[0][0] != values1[0][0] ){
            System.out.println( N - values0[0][1] - values1[0][1] );
        } else {
            if( values0[0][1] >= values1[0][1] ){
                System.out.println( N - values0[0][1] - values1[1][1] );
            } else {
                System.out.println( N - values0[1][1] - values1[0][1] );
            }
        }
        
    }
}
