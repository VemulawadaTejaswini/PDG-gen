import java.util.*;
public class Main {
	static int cnt=0,n;
	static int bfs(int sum,int mae){
		if(sum==n)return 1;
		if(sum>n)return 0;
		return bfs(sum+mae+1,mae+1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			cnt=0;
			n = in.nextInt();
			if(n==0)break;
			for(int i=1;i<n;i++){
				cnt+=bfs(i,i);
			}
			System.out.println(cnt);
		}
	}
}