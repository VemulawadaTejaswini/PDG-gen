import java.util.Scanner;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++ ){
            A[i] = Integer.parseInt(sc.next()) - 1;
        }
        int B[] = new int[N];
        for (int i= 0; i < N; i++){
            B[i] = Integer.parseInt(sc.next());
        }
        int C[] = new int[N-1];
        for (int i=0; i<N-1; i++){
            C[i] = Integer.parseInt(sc.next());
        }

        int point = B[A[0]]; //最初の1食目はその料理の満足度のみ
        for (int i = 1; i < N; i++){
            point += B[A[i]];
            if (A[i] == A[i-1] + 1){
                point += C[A[i-1]];
            }
        }
        out.println(point);

        //テンプレ
        sc.close();
        out.flush();
    }
}