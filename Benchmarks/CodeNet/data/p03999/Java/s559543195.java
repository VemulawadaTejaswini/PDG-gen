import java.util.Scanner;

class Main{
static long ans = 0;
static String string;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		
		string = sc.next();
		dfs(1,0,0);
		System.out.println(ans);
		
		
	}
	
	static void dfs(int p,long sum,int kireme){
		long num =  Long.parseLong(string.substring(kireme, p));	
	//	System.out.println(" p "+p);
	//	System.out.println(num);

		if(p == string.length()){
			ans += sum+num;
			return;
		}
		
		
		dfs(p+1, sum,kireme);
		
		dfs(p+1, sum+num,p);

		
		
		
	}
}