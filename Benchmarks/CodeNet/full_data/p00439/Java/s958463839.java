import java.util.*;

public class Main{
	public static void main(String[] args){
		int i,j;
		int pre,max;
		Scanner sc = new Scanner(System.in);

		while(true){
			int n=sc.nextInt(), k=sc.nextInt();
			if(n==0 && k==0) break;
			int[] x = new int[n];

			for(i=0;i<n;i++) x[i]=sc.nextInt();
			for(i=0,pre=0;i<k;i++) pre+=x[i];
			max = pre;
			for(j=1;j<n-k;j++){
				pre = pre - x[j-1] + x[k+j-1];
				if(max < pre) max = pre;
			}
			System.out.println(max);
		}
	}
}