import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int count=0;
		int x=0;
		int[] s=new int[N];
		
		if(N==1 && M==0) {
			System.out.println(0);
			System.exit(0);
		}
		if(M==0) {
			System.out.println(-1);
			System.exit(0);
		}
		
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
					count++;
				}
			}
		}
		if(s[0]==0 && N>1) {
			count++;
		}
		if(count==0) {
			for(int i=0;i<N;i++) {
				System.out.print(s[i]);
			}
		}
		else {
			System.out.print(-1);
		}
		
		sc.close();
	}
}
