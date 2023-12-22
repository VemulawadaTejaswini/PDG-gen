import java.util.Scanner;

public class Main {

	static int N;
	static int[][] g;
	static String start;
	static String[] s;
	static boolean ans;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		label:while(true){
			ans=false;
			N=cin.nextInt();
			if(N==0)break;
			s=new String[N];
			g=new int[26][26];

			int[][] jisuu=new int[26][2];
			for(int i=0;i<N;i++){
				s[i]=cin.next();
				int a=s[i].charAt(0)-'a';
				int b=s[i].charAt(s[i].length()-1)-'a';
				g[a][b]++;
				jisuu[a][0]++;
				jisuu[b][1]++;
			}
			for(int i=0;i<N;i++){
				
			}

			for(int i=0;i<N;i++){
				if(jisuu[i][0]!=jisuu[i][1]){
					System.out.println("NG");	
					continue label; 
				}
			}
			ans=false;			
			for(int i=0;i<26;i++){
				dfs(i,0);
			}
			if(ans){
				System.out.println("OK");
			}
			else{
				System.out.println("NG");	
			}
		}
	}
	static void dfs(int start,int step){
		if(step==N)ans=true;
		for(int i=0;i<26;i++){
			if(g[start][i]>0){
				g[start][i]--;
				dfs(i,step+1);
				g[start][i]++;
			}
		}
	}
	static void bt(int a,String before,int step){
//		System.out.println(a+" "+before+" "+step);
		if(step==N){
			if(before.charAt(before.length()-1)==start.charAt(0))
				ans=true;
		}
		for(int i=0;i<N;i++){
			if(s[i]==null)continue;
			if(s[i].charAt(0)==before.charAt(before.length()-1)){
				String tmp=s[i];
				s[i]=null;
				bt(i,tmp,step+1);
				s[i]=tmp;
			}
		}
	}
}