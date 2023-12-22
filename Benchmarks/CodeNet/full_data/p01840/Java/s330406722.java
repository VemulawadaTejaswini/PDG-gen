import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),m=in.nextInt(),t=in.nextInt();
		int time=0,A[]=new int[n];
		boolean inlib=true;
		for(int i=0;i<n;i++)A[i]=in.nextInt();
		for(int i=0;i<n;i++) {
			if(inlib) {
				time+=m;
				inlib=false;
				//System.out.println("go entrance");
			}
			else if(i>0 && A[i]-A[i-1]<2*m)time+=A[i]-A[i-1];
			if(i<n-1 && A[i+1]-A[i]>=2*m) {
				time+=m;
				inlib=true;
				System.out.println("go lib");
			}
			if(i==n-1 && t-A[i]<m)time+=t-A[i];
			else if(i==n-1)time+=m;
			
			//System.out.printf("i=%d time=%d\n",i,time);
		}
		System.out.println(t-time);
	}

}

