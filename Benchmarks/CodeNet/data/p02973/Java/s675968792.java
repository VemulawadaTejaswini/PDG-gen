import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];
        int tree[] = new int[N];
        int count = 0;

        A[0] = sc.nextInt();
        tree[0] = A[0];
        count++;

        for(int i = 1; i < N; i++){
            A[i] = sc.nextInt();
            int d_max = 1000000000;
            int max_j = 0;
            for(int j = 0; j < count; j++){
                if(A[i] - tree[j] < d_max && A[i] - tree[j] > 0){
                    d_max = A[i] - tree[j];
                    max_j = j;
                }
            }
            if(d_max == 1000000000){
                tree[count] = A[i];
                count++;
            }else{
                tree[max_j] = A[i];
            }
            //for(int k = 0; k < count; k++){
            //    System.out.println("tree[" + k + "]" + tree[k]);
            //}
            //System.out.println();
        }

        System.out.println(count);

        sc.close();
    }
}