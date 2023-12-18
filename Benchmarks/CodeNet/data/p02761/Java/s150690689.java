import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int x=0;
		int[] s=new int[N];

		for(int i=0;i<N;i++) {
			s[i]=0;
		}
		
		for(int i=0;i<M;i++) {
			x=sc.nextInt();
			if(s[x-1]==0){
				s[x-1]=sc.nextInt();
			}
			else {
				int k=sc.nextInt();
				if(s[x-1]!=k) {
					System.out.println(-1);
					System.exit(0);
				}
			}
		}
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=s[i];
		}
		if(N==1 && sum==0) {
			System.out.println(0);
			System.exit(0);
		}
		if(N>1 && sum==0) {
			s[0]=1;
		}
		
		if(s[0]==0 && N>1) {
			s[0]=1;
		}
		for(int i=0;i<N;i++) {
			System.out.print(s[i]);	
		}
		
		sc.close();
	}
}
