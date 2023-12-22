import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        long s = 0;
        
        for(int i = 0 ; i < N ; i++){
           A[i] = sc.nextInt();
        }
        
        int Q = sc.nextInt();
        
        int[] B = new int[Q];
        int[] C = new int[Q];
        for(int i = 0 ; i < Q ; i++){
            s = 0;
           B[i] = sc.nextInt();
           C[i] = sc.nextInt();
           for(int sec = 0 ; sec < N ; sec++){
                if(A[sec] == B[i]){
                    A[sec] = C[i];
                }
                s = s + A[sec];
           }
           System.out.println(s);
        }
        
        
    }
}
