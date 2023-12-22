import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			int[] kaidan = new int[n+1];
			for(int i=0;i<n;i++)kaidan[i]=0;
			kaidan[0]=1;
			for(int s=0;s<n+1;s++)for(int i=s+1;i<=s+3;i++){
					if(i>=n+1)continue;
					kaidan[i]+=kaidan[s];
			}
			System.out.println((kaidan[n]/3650)+1);
		}
	}
}