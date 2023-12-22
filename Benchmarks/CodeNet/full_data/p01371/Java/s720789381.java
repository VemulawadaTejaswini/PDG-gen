import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ4
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1,-1,1,1,-1}, vy={-1,0,1,0,-1,-1,1,1};
	final int[] vvx={0,1,0,-1,-1,1}, vvy={-1,0,1,0,-1,1};
	final int INF=1<<24;
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	class parsed{
		String line;
		int pos=0,ans=0;
		public parsed(String line) { this.line=line; ans=expr();}
		private int expr(){
			int res=term();
			while(true){
				char op=line.charAt(pos);
				if(op=='+' || op=='-'){
					int old=res;
					pos++;
					res=term();
					switch(op){
					case '+':res=old+res;	break;
					case '-':res=old-res;	break;
					}
				}else	break;
			}
			return res;
		}
		private int term(){
			int res=fact();
			while(true){
				char op=line.charAt(pos);
				if(op=='*' || op=='/'){
					int old=res;
					pos++;
					res=fact();
					switch(op){
					case '*':res=old*res;	break;
					case '/':res=old/res;	break;
					}
				}else	break;
			}
			return res;
		}
		private int fact(){
			if(Character.isDigit(line.charAt(pos))){
				int t=line.charAt(pos)-'0';
				pos++;
				while(Character.isDigit(line.charAt(pos))){
					t=t*10+(line.charAt(pos)-'0');
					pos++;
				}
				return t;
			}else if(line.charAt(pos)=='('){
				pos++;
				int res=expr();
				pos++;
				return res;
			}
			return 0;
		}
		@Override public String toString() {	return Integer.toString(ans);}
		public int intValue(){	return ans;}
	}
	public static void main(String[] args) {
		//long s=System.currentTimeMillis();
		new Main().B();
		//out.println((System.currentTimeMillis()-s)+"msec");
		//new Main().doIt();
	}
	void doIt(){
		out.println(fact(10));
	}
	int fact(int f){
		if(f==1)	return 1;
		return f*fact(f-1);
	}
	
	
	HashSet<Integer> ans=new HashSet<Integer>();
	ArrayList<Integer> d,k;	ArrayList<Character> e;
	void D(){
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			if(c[0]=='#')	break;
			d=new ArrayList<Integer>();
			k=new ArrayList<Integer>();
			e=new ArrayList<Character>();
			int p=0;
			for(int i=0; i<c.length; i++){
				if(Character.isDigit(c[i])){
					int dd=c[i]-'0';
					while(i+1<c.length){
						if(!Character.isDigit(c[i+1]))	break;
						dd=dd*10+(c[++i]-'0');
					}
					d.add(dd);
				}else if(c[i]=='(')	p++;
				else if(c[i]==')')	p--;
				else{
					e.add(c[i]);
					k.add(p);
				}
			}
			out.println(d);
			out.println(e);
			out.println(k);
			
			out.println(DtoString(d,e,k));
			for(int i=0; i<k.size(); i++)	solveD(k,new boolean[k.size()],i,k.size());
			
			out.println(ans.size());
		}
	}
	void solveD(ArrayList<Integer> k,boolean[] b,int idx,int n){
		if(n<=0){
			ans.add(new parsed(DtoString(d,e,k)).intValue());
		}else{
			
		}
	}
	String DtoString(ArrayList<Integer> d,ArrayList<Character> e,ArrayList<Integer> k){
		StringBuilder ans=new StringBuilder();
		int kk=0;
		for(int i=0; i<e.size(); i++){
			if(kk<k.get(i)){
				for(int j=0; j<abs(kk-k.get(i)); j++)	ans.append((kk<k.get(i)?"(":")"));
				kk=k.get(i);
			}
			ans.append(d.get(i));
			if(kk>k.get(i)){
				for(int j=0; j<abs(kk-k.get(i)); j++)	ans.append((kk<k.get(i)?"(":")"));
				kk=k.get(i);
			}
			ans.append(e.get(i));
		}
		ans.append(d.get(d.size()-1));
		while(--kk>=0)	ans.append(")");
		return ans.toString();
	}
	
	void A(){
		int [] data = new int[26];
		for(int i=7; i <=14; i++ ){
			data[i] = -1;
		}
		data[15] = -1;
		data[20] = -1;
		data[24] = -1;
		while(sc.hasNext()){
			String  str = sc.next();
			if(str.equals("#")) break;
			int temp = str.charAt(0) - 'a';
			temp = data[temp];
			int c = 0;
			for(int i= 1; i < str.length(); i++){
				int ind = str.charAt(i) - 'a';
				if(data[ind] != temp){
					temp = data[ind];
					c++;
				}
			}
			System.out.println(c);
		}
	}
	void B(){
		while(sc.hasNext()){
			int t=sc.nextInt(),n=sc.nextInt(),ans=0;
			if((t|n)==0)	break;
			boolean[][] b=new boolean[200][200];
			for(int i=0; i<n; i++)	b[sc.nextInt()+100][sc.nextInt()+100]=true;
			int sx=sc.nextInt()+100,sy=sc.nextInt()+100;
			LinkedList<ClassB> open=new LinkedList<ClassB>();
			open.add(new ClassB(sx,sy,0));
			boolean[][] close=new boolean[200][200];
			close[sx][sy]=true;
			while(!open.isEmpty()){
				ClassB now=open.poll();
				ans++;
				if(now.t>=t)	continue;
				for(int i=0; i<6; i++){
					int xx=now.x+vvx[i],yy=now.y+vvy[i];
					//if(!Point.ok(0xx, yy, 100, 100))	continue;
					if(close[xx][yy])	continue;
					if(b[xx][yy])	continue;
					open.add(new ClassB(xx,yy,now.t+1));
					close[xx][yy]=true;
				}
			}
			out.println(ans);
		}
	}
	class ClassB{
		int x,y,t;
		ClassB(int x,int y,int t){this.x=x; this.y=y; this.t=t;}
	}
	
	void C(){
		final int CINF = 16 * 100000 + 1;
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [][] data = new int[n][n+1];
			for(int i = 0; i < n; i++){
				for(int j = 0; j <= n; j++){
					data[i][j] = sc.nextInt();
				}
			}
			int [][] dp = new int [n+1][1 << n];
			for(int i = 0; i <= n; i++) for(int j = 0; j < 1<<n; j++)dp[i][j] = INF;
			for(int i = 0; i < n; i++){
				dp[0][1 << i] = data[i][0];
			}
			
			for(int i =1; i < (1 << n); i++){
				for(int j = 0; j <= n; j++){
					if(dp[j][i] == 0) continue;
					for(int k = 0; k < n; k++){
						if( (i & (1 << k)) == 1 ) continue;
						int ind = i | (1 << k);
						//if(dp[0][ind] == 0){
							//dp[0][ind] = data[k][0] + dp[j][i];
						//}
						//else{
							dp[0][ind] = Math.min(dp[0][ind] , data[k][0] + dp[j][i]);
						//}
						for(int l = 0; l < n; l++){
							if((i & (1 << l)) == 0)continue;
							//if(dp[l+1][ind] == -1){
								//dp[l+1][ind] = data[k][l+1] + dp[j][i];
							//}
							//else{
								dp[l+1][ind] = Math.min(dp[l+1][ind], data[k][l+1] + dp[j][i]);
							//}
						}
					}
				}
			}// end i
			
			int ans = INF;
			for(int i = 0; i <= n; i++){
				ans = Math.min(ans, dp[i][(1 << n) - 1]);
				//System.out.println(dp[i][(1 << n) - 1]);
			}
			//System.out.print("ANS =");
			System.out.println(ans);
			
			//debug
//			for(int i =0; i < (1 << n); i ++){
//				System.out.printf("%3d ", i);
//			}
//			System.out.println();
//			for(int j = 0; j <= n; j++){
//				for(int i =0; i < (1 << n); i ++){
//					System.out.printf("%3d ", dp[j][i]);
//				}
//				System.out.println();
//			}
//			System.out.println();
			
		}
	}
	
	
	
	
	
}