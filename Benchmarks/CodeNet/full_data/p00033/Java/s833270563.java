import java.util.*;
public class AOJ0033{
	static int ball[];
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ball=new int[10];
		for(int i=0;i<n;i++){	
			for(int j=0;j<10;j++)ball[j]=sc.nextInt();
			result = false;
			dfs(0,0,cnt);
			if(result)System.out.println("YES");
			else System.out.println("NO");
		}
	}

	static int L=0,R=0,cnt=0;
	static boolean result;
	static boolean dfs(int L, int R, int cnt){
		if(cnt==10){
			result = true;
			return true;
		}else{
			if(L<ball[cnt])dfs(ball[cnt],R,cnt+1);
			else if(R<ball[cnt])dfs(L,ball[cnt],cnt+1);


			return false;
		}
	}
}