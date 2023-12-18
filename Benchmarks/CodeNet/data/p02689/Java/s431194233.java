import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] H = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            H[i] = sc.nextLong();
        }
        HashMap<Integer, Long> highA = new HashMap<>();
        HashMap<Integer, Long> highB = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (!highA.containsKey(A) || highA.get(A) < H[B]) {
                highA.put(A, H[B]);
            }
            if (!highB.containsKey(B) || highB.get(B) < H[A]) {
                highB.put(B, H[A]);
            }

        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            long highH = H[i];
            if (!highA.containsKey(i) && !highB.containsKey(i)) {
                ans++;
            } else if (highA.containsKey(i) && !highB.containsKey(i)) {
                if (highA.get(i) < H[i]) {
                    ans++;
                }
            }else if(!highA.containsKey(i)&&highB.containsKey(i)){
                if(highB.get(i)<H[i]){
                    ans++;
                }
            }else if(highA.containsKey(i)&&highB.containsKey(i)){
                if(highA.get(i)<H[i]&&highB.get(i)<H[i]){
                    ans++;
                }
            }

        }
        System.out.println(ans);

    }

    
}
