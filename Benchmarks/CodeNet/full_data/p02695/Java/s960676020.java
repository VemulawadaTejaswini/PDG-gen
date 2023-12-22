import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();        
		int [] a = new int [q];
        int [] b = new int [q];
        int [] c = new int [q];
        int [] d = new int [q];
        int [] A = new int [n];
        for(int i=0;i<q;i++){a[i] = sc.nextInt();
                             b[i] = sc.nextInt();
                             c[i] = sc.nextInt();
                             d[i] = sc.nextInt();
                            }
		int ans = 0;
        int score = 0;        
        for(int i=0;i<n;i++){A[i] = 1;
                            }
        for(int i=0;i<q;i++){if(A[b[i]-1]-A[a[i]-1]==c[i]){score+=d[i];}}
        ans = Math.max(ans,score);
		System.out.println(ans);
	}
}
