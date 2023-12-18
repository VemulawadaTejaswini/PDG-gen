import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] ans=new long[n];
		PriorityQueue<Integer> q=new PriorityQueue<>();
		int[][] a=new int[n][2];
		for(int i=0; i<n; i++){
			a[i][0]=sc.nextInt();
			a[i][1]=i;
		}
		Arrays.sort(a,(x,y)->(x[0]-y[0]));
		int index=n-1;
		for(int i=n-1; i>=0; i--){
			while(index>=0 && a[i][0]==a[index][0]){
				q.add(a[index][1]);
				index--;
			}
			if(index<0){
				break;
			}
			ans[q.peek()]+=(long)(n-index-1)*(a[index+1][0]-a[index][0]);
			i=index+1;
		}
		ans[q.peek()]+=(long)n*a[0][0];
		for(int i=0; i<n; i++){
			System.out.println(ans[i]);
		}
	}
}
