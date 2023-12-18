import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] variation = new int[N];
		int count = 0;
		int i,j,k =0;
		int[] max = new int[N];
		
		for(i=0;i<N;i++){
			variation[i] = sc.nextInt();
		}
		
		for(j=0;j<N;j++){
			X = X - variation[j];
			count++;
		}
		
		for(k=0;k<N;k++){
			max[k]=X/variation[k];
		}
		
		for(j=0;j<N;j++){
			for(k=j+1;k<N;k++){
				if(max[k]>max[j]){
					int t = max[k];
					max[k] = max[j];
					max[j] = t;
				}
			}
		}
		
		count = count + max[0];
		
		System.out.println(count);
	}
}