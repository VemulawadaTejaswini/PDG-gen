import java.util.*;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static int n=sc.nextInt();
	static int arr[][]=new int[n][3];
	public static void main(String args[]){
		for(int i=0;i<n;i++){
			arr[i]=new int[4];
			for(int j=1;j<4;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int ans=maxAmount(0,0);
		System.out.println(ans);
	}
	public static int maxAmount(int day,int flag){
		if(day==n){
			return 0;
		}
		int maxi=0;
		if(flag==0){
			maxi=Math.max(maxi, arr[day][1]+maxAmount(day+1,1));
			maxi=Math.max(maxi, arr[day][2]+maxAmount(day+1,2));
			maxi=Math.max(maxi, arr[day][3]+maxAmount(day+1,3));
		}
		else if(flag==1){
			maxi=Math.max(maxi, arr[day][2]+maxAmount(day+1,2));
			maxi=Math.max(maxi, arr[day][3]+maxAmount(day+1,3));
		}
		else if(flag==2){
			maxi=Math.max(maxi, arr[day][1]+maxAmount(day+1,1));
			maxi=Math.max(maxi, arr[day][3]+maxAmount(day+1,3));
		}
		else{
			maxi=Math.max(maxi, arr[day][2]+maxAmount(day+1,2));
			maxi=Math.max(maxi, arr[day][1]+maxAmount(day+1,1));
		}
		return maxi;
	}
}
