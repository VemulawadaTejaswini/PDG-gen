import java.util.*;
 
public class Main{
    
    static int N;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        int Q = sc.nextInt();
        int[][] a = new int[2][N-1];
        int[][] p = new int[2][Q];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N-1; i++){
            a[0][i] = sc.nextInt();
            a[1][i] = sc.nextInt();
            map.put(a[1][i], a[0][i]); //構造を代入しただけ
        }

        long[] count = new long[N];
        Arrays.fill(count, 0);
        for(int i = 0; i < Q; i++){
            p[0][i] = sc.nextInt();
            p[1][i] = sc.nextInt();
            count[p[0][i]-1] += p[1][i]; //数値増加を配列で制御
        }
        sc.close();
 
        for(int i = 1; i < N; i++){
            count[i] += count[map.get(i+1)-1];
        }
        for(int i = 0; i < N; i++)
            System.out.println(count[i]);
    }
}
