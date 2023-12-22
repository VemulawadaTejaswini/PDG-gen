import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        for(int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        
        int[] num = new int[N+1];
        num[1] = -1;
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        while(!queue.isEmpty()) {
            int n = queue.poll();
            //System.out.println("n:" + n);
            for(int i = 0; i < M; i++) {
                //System.out.println("A[" + i + "]:" + A[i] + ",B[" + i + "]:" + B[i] + ",num[A[" + i + "]]:" + num[A[i]]);
                if(n == A[i] && num[B[i]] == 0) {
                    num[B[i]] = n;
                    //System.out.println("A num[i]:" + num[i]);
                    queue.add(B[i]);
                    //System.out.println("num[i]:" + num[i] + ",add:" + B[i]);
                }
                //System.out.println("A[" + i + "]:" + A[i] + ",B[" + i + "]:" + B[i] + ",num[B[" + i + "]]:" + num[B[i]]);
                if(n == B[i] && num[A[i]] == 0) {
                    num[A[i]] = n;
                    //System.out.println("B num[i]:" + num[i]);
                    queue.add(A[i]);
                    //System.out.println("add:" + A[i]);
                }
            }
        }
        for(int i = 2; i < N+1; i++) {
                System.out.println(num[i]);
        }
    }
}
