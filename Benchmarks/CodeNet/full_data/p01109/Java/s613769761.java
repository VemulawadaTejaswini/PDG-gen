import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true){
			int n=in.nextInt();
			if(n==0)break;
			int A[]=new int[n];
			
			int ave=0;
			for(int i=0;i<n;i++){
				A[i]=in.nextInt();
				ave+=A[i];
			}
			ave/=n;
			int cnt=0;
			for(int i=0;i<n;i++){
				if(A[i]<=ave)cnt++;
			}
			System.out.println(cnt);
		}
	}

}

