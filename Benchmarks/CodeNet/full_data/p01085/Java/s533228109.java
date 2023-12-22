import java.util.Scanner;
import java.util.*;
public class Main {
	//static int n,k,u[],min[count],max;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans[]=new int[100000];

		int count=-1;
		while(true){
			count++;
			int m = sc.nextInt();
			int nMin=sc.nextInt();
			int nMax=sc.nextInt();
			if(m==0 && nMin==0 && nMax==0){
				break;
			}
			int p[]=new int[m];
			for(int i=0;i<m;i++){
				p[i]=sc.nextInt();
			}
			Arrays.sort(p);
			for(int i=0;i<m/2;i++){
				int temp=p[i];
				p[i]=p[m-1-i];
				p[m-1-i]=temp;
			}
			//System.out.println(Arrays.toString(p));
			int gap=-1;
			for(int i=nMin;i<=nMax;i++){
				int hoge=p[i-1]-p[i];
				//System.out.println(hoge+","+gap[count]);
				if(hoge>=gap || gap==-1){
					gap=hoge;
					ans[count]=i;
					//System.out.println(gap[count]);
				}
			}
		}
		for(int i=0;i<count;i++){
			System.out.println(ans[i]);
		}
	}
}