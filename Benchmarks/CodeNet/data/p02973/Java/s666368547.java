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
            if(tree[0] >= A[i]){
                tree[count] = A[i];
                Arrays.sort(tree);
                count++;
            }else{
                for(int j = 0; j < count; j++){
                    if(tree[j] > A[i]){
                        tree[j] = A[i];
                    }
                }
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