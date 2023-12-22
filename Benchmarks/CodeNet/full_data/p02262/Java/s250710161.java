import java.util.Scanner;
public class Main{
    public static int count(int n){
        int cnt = 1;
        int num = 1;
        while(true){
            num = 3 * num + 1;
            if(n < num)
                break;
            cnt++;
        }
        return cnt;
    }
    public static void shellSort(int A[], int n){
        int cnt = 0;
        int m = count(n);
        int G[] = new int[m];
        int x = 1;
        for(int i = 0 ; i < m ; i++){
            G[m-1 - i] = x;
            x = 3*x + 1;
        }
        for(int i = 0 ; i < m ; i++){
            for(int j = G[i] ; j < n ; j++){
                int v = A[j];
                int k = j - G[i];
                while(k >= 0 && A[k] > v){
                    A[k+G[i]] = A[k];
                    k -= G[i];
                    cnt++;
                }
                A[k+G[i]] = v;
            }
        }
        System.out.println(m);
        for(int i = 0 ; i < m-1 ; i++)
            System.out.print(G[i] + " ");
        System.out.println(G[m-1]);
        System.out.println(cnt);
        for(int i = 0 ; i < n ; i++)
            System.out.println(A[i]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            A[i] = sc.nextInt();
        shellSort(A,n);
    }
}
