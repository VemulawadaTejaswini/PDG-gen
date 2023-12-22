import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static int map[][];
	public static int t=0,s=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int data[][]=new int[n][n];
			int num[]=new int[n];
			for(int i=0;i<n;i++){//人数
				num[i]=sc.nextInt();
				//System.out.println(num[i]);
				for(int j=0;j<num[i];j++){
					data[i][j]=sc.nextInt();
					//System.out.print(data[i][j]+" ");
				}
				//System.out.println();
			}
			
			int know=sc.nextInt();
			int k[]=new int[know];
			for(int i=0;i<know;i++){
				k[i]=sc.nextInt();
				//System.out.print(k[i]+" ");
			}
			//System.out.println();
			int cnt=0,ans=0,x=0;
			for(int i=0;i<n;i++){
				cnt=0;
				for(int j=0;j<num[i];j++){
					for(int l=0;l<know;l++){
						if(data[i][j]==k[l]){
							//System.out.println(data[i][j]+" "+k[l]);
							cnt++;
						}
					}
				}
				if(cnt==know){
					ans=i+1;x++;
				}
				//cnt=0;
			}
			if(x>1||cnt>0)ans=-1;
			System.out.println(ans);
		}
	}
}