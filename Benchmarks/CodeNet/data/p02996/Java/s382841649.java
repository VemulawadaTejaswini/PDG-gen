import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        Work W[] = new Work[N];
        for (int i = 0; i < N; i++){
            A[i] = cin.nextInt();
            B[i] = cin.nextInt();
            W[i] = new Work(A[i], B[i]);
        }
        if(solve(N, W)) System.out.println("Yes");
        else System.out.println("No");
    }

    class Work implements Comparable<Work>{
        public int A, B;
        public Work(int A, int B){
            this.A = A; this.B = B;
        }
        @Override
        public int compareTo( Work w ){
            return this.B - w.B;
        }
    }

    boolean solve(int N, Work[] W){
        //仕事時間の短い順にソートする
        Arrays.sort(W);
        int time = 0;
        //順番に仕事を消化していく
        for (Work w: W){
            time += w.A;
            // 納期を過ぎていたら失敗
            if(time > w.B) return false;
        }
        //最後まで仕事を終えることが出来たら
        return true;
    }
}

