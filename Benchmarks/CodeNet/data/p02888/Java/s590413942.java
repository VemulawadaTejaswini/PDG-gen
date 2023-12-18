import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k =j+1;k<n;k++){
					if(x[k]<x[j]+x[i]&&x[j]<x[i]+x[k]&&x[i]<x[k]+x[j])
						sum++;
				}
			}
		}
		System.out.println(sum);
	}
}
