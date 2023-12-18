import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        // 良い展望台フラグ
        boolean[] good = new boolean[N];
        // 展望台の標高
        HashMap<Integer,Integer> high = new HashMap<Integer,Integer>();
        for (int i = 0; i < N; i++) {
            high.put(i+1,sc.nextInt());
            good[i] = true;
        }
        int A = 0;
        int B = 0;
        for (int i = 0; i < M; i++) {
              A = sc.nextInt();
              B = sc.nextInt();
            if(high.get(A)>=high.get(B)){
                good[B-1] = false;
            }
            if(high.get(A)<=high.get(B)){
                good[A-1] = false;
            }
        }
        // 良い展望台の数
        int count = 0;
        for (int i = 0; i < N; i++) {
            if(good[i]){
                count++;
            }
        }
        System.out.println(count);

    }
}
