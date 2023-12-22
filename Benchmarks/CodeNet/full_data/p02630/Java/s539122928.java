import java.util.HashMap;
import java.util.Scanner;
class Main{
    static long sum = 0;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scan.nextInt();
        int[] arr = new int[N];
        takeInput(arr);
        int Q = scan.nextInt();
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        HashMap<Integer, Integer> fmap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(fmap.containsKey(arr[i])) {
                int ov = fmap.get(arr[i]);
                ov = ov + 1;
                fmap.put(arr[i], ov);
            }else {
                fmap.put(arr[i], 1);
            }
        }
        while(Q > 0) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(sumAfterOp(arr, A, B, fmap));
            Q--;
        }
    }

    private static void takeInput(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
    }

    private static long sumAfterOp(int[] arr, int A, int B, HashMap<Integer, Integer> fmap) {
        if(fmap.containsKey(A)) {
            int A_count = fmap.get(A);
            fmap.put(A, 0);
            sum -= A_count * A;
            if(fmap.containsKey(B)){
                fmap.put(B, fmap.get(B) + A_count);
            }else {
                fmap.put(B, A_count);
            }
            sum += A_count * B;
        }
        return sum;
    }
}
