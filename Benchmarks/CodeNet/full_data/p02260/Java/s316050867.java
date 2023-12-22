import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = selectionSort(a,N);
        for (int i = 0; i < N; i++) {
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println(cnt);
        
        sc.close();
    }

    static int selectionSort(int[] A,int N)
    {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int minj = i;
            for (int j = i; j < N; j++) {
                if(A[j] < A[minj])
                {
                    minj = j;
                }
            }
            if(A[i] == A[minj])continue;
            int buf = A[i];
            A[i] = A[minj];
            A[minj] = buf;
            cnt++;
        }
        return cnt;
    }
}
