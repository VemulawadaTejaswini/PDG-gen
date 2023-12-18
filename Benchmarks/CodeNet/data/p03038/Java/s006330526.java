import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer A[] = new Integer[n];
        Integer B[] = new Integer[m];
        Integer C[] = new Integer[m];
        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<m; i++) {
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for(int i=0;i<m;i++){
            for(int j=0;j<i;i++){
                if(C[i]>A[j]){
                    A[j]=C[i];
                }
            }
            int ans = 0;
            for(int h=0; h<A.length; h++){
                ans += A[h];
            }
            System.out.println(ans);
        }
    }