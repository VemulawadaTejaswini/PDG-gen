package ex;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] r = new int[n+3];
		int[] day = new int[m+3];
		int[] day2 = new int[m+3];
		int ans=0;
		int count=0;
		for(int i=0;i<n;i++)  r[i] = sc.nextInt();
		for(int i=0;i<m;i++)  day[i] = sc.nextInt();
		for(int i=0;i<m-n-1;i++){
			day2[count]=0;
			for(int j=0;j<m;j++){
				if(day[j]>day2[count]) day[count]=j;
			}
			day[day2[count]]=0;
			count+=1;
		}
		count=0;
		for(int i=0;i<m;i++){
			if(day[i]!=0 ){
				ans=ans+day[i]*r[count];
			}
			if(count==n-1) break;
			count+=1;
		}
		System.out.println(ans);
    }
}