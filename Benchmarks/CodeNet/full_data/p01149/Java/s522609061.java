import java.util.Scanner;

//Blackjack
public class Main{

	char[] s;
	int res;
	boolean bj;
	
	int f(char c){
		if(Character.isDigit(c))return c-'0';
		return c=='A'?1:10;
	}
	
	void dfs(int k, int sum, boolean ace){
		if(sum<=16||sum==17&&ace){
			int x = f(s[k]);
			if(x==1){
				if(sum+11<=21)
					dfs(k+1, sum+11, true);
				else
					dfs(k+1, sum+1, ace); 
			}
			else dfs(k+1, sum+x, ace);
		}
		else{
			if(sum<=21)res = Math.max(res, sum);
			if(k==2&&sum==21)bj = true;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0){
			res = 0;
			bj = false;
			s = new char[10];
			for(int i=0;i<10;i++)s[i]=sc.next().charAt(0);
			dfs(0, 0, false);
			System.out.println(bj?"blackjack":res==0?"bust":res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}