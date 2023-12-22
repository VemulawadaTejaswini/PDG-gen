import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] x=new int[n];
		int max = 0;
		boolean[] all=new boolean[10000000];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
			if(x[i]>max)
				max = x[i];
		}
		Arrays.sort(x);
		for(int i=0;i<n-1;i++){
			if(!all[x[i]]){
				if(x[i]==x[i+1])
					all[x[i]] = true;
			}
		}
		for(int i=0;i<n;i++){
			if(all[x[i]]){
				continue;
			}
			for(int j=2;j*x[i]<=max;j++){
				if(!all[j*x[i]]){
					all[j*x[i]] = true;
				}
				if(j*x[i]>max)
					break;
			}
			if(x[i]*2>max)
				break;
			
		}
		int sum = n;
		for(int i=0;i<n;i++){
			if(all[x[i]]){
				sum--;
			}
		}
		System.out.println(sum);
	}
}
