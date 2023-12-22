import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		while(true){
		int n=scan.nextInt();
		if(n==0)break;
		int []a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int r=a.length-1,l=0,cnt=0;
		while(l<=r){
			int h =(r+l)/2;
			++cnt;
			if(a[h]==m)break;
			if(a[h]<m){
				l=h+1;
			}
			else{
				r=h-1;
			}
		}
		System.out.println(cnt);
	}
	}
}