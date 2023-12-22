import java.util.*;

public class Main {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i <N; i++) {
            A[i] = sc.nextInt();
        }
        String ans = "";
        bubbleSort(A, N);
        for (int i = 0; i <N; i++) {
            ans += A[i] + " ";
        }
        System.out.println(ans.substring(0, ans.length()-1));
        System.out.println(cnt);
    }
    static void bubbleSort(int[] A, int N) {
        int pos = 0;
        int tmp;
        while(pos != N-1) {
            for (int i = N - 1; i > pos; i--) {
                if(A[i] < A[i-1]){
                    tmp = A[i];
                    A[i] = A[i-1];
                    A[i-1] = tmp;
                    cnt++;
                }
            }
            pos++;
        }
    }
}

