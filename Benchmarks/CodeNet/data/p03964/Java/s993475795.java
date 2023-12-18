import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int T[] = new int[n];
		int A[] = new int[n];
		
		for(int i=0;i<n;i++){
		    T[i] = sc.nextInt();
		    A[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++){
		    int t = T[i+1];
		    int a = A[i+1];
		    double p1 = (double)A[i];
		    double p2 = (double)A[i+1];
		    double q1 = (double)T[i];
		    double q2 = (double)T[i+1];
		    if(T[i]>T[i+1]||A[i]>A[i+1]){
		        double j = Math.ceil(Math.max(q1/q2,p1/p2));
		        T[i+1]=t*(int)j;
		        A[i+1]=a*(int)j;
		    }
		}
		int num = T[n-1] + A[n-1];
		// 出力
		System.out.println(num);
    }
}
