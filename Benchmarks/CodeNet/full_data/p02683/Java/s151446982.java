import java.math.*;
import java.util.*;

public class Main {
	public static int x,min=Integer.MAX_VALUE;
	public static void dfs(boolean buf[],int aim[],int arr[][],int k){
		for(int i=1;i<aim.length;i++){
			if(aim[i]<x)
				break;
			if(i==aim.length-1){
				min=Math.min(min, aim[0]);
				return;
			}
		}
		boolean flag=true;
		for(int i=0;i<buf.length;i++){
			if(!buf[i]){
				break;
			}
			if(i==buf.length){
				if(min==Integer.MAX_VALUE){
					min=-1;
				}
				return;
			}
		}
		for(int i=k;i<buf.length;i++){
			if(!buf[i]){
				buf[i]=true;
				for(int j=0;j<aim.length;j++){
					aim[j]+=arr[i][j];
				}
				dfs(buf,aim,arr,k+1);
				for(int j=0;j<aim.length;j++){
					aim[j]-=arr[i][j];
				}
				buf[i]=false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		x=sc.nextInt();
		int arr[][]=new int[n][m+1];
		for(int i=0;i<n;i++){
			for(int j=0;j<=m;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		boolean buf[]=new boolean [n];
		int aim[]=new int[m+1];
		dfs(buf,aim,arr,0);
		System.out.println(min==2147483647?-1:min);
	}
}