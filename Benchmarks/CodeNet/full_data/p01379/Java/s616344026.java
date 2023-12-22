import java.util.Scanner;

public class Main {

	static int H,W,memory,dir;
	static char[][] field;
	static byte[][][][] dp;
	static int[] v1={-1,0,1,0};
	static int[] v2={0,1,0,-1};
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		H=cin.nextInt();
		W=cin.nextInt();
		memory=0;
		dir=1;
		field=new char[H][];

		//memory, dir 
		dp=new byte[H][W][16][4];
		
		for(int i=0;i<H;i++){
			field[i]=cin.next().toCharArray();
		}
		if(dp(0,0)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}
	static boolean dp(int x,int y){
		if(dp[x][y][memory][dir]==1){
			return false;
		}
		dp[x][y][memory][dir]=1;
		if(field[x][y]=='@'){
			return true;
		}
		else if(field[x][y]=='?'){
			int tmpdir=dir;
			int tmpmem=memory;
			
			for(int i=0;i<4;i++){
				dir=i;
				int[] next=step(x,y);
				if(dp(next[0],next[1])){
					return true;
				}
			}
			dir=tmpdir;
			memory=tmpmem;
		}
		else{
			int tmpdir=dir;
			int tmpmem=memory;
			command(field[x][y]);
			int[] next=step(x,y);
//			System.out.println(memory+" "+dir+" "+x+" "+y);
//			System.out.println(next[0]+" "+next[1]);
			if(dp(next[0],next[1])){
				return true;
			}
			dir=tmpdir;
			memory=tmpmem;
		}
		return false;
	}
	
	static int[] step(int x,int y){
		int[] re=new int[2];
		re[0]=(x+H+v1[dir])%H;
		re[1]=(y+W+v2[dir])%W;
		return re;
	}
	// @,? テ」ツ?ッテ、ツセツ凝・ツ、ツ?
	static void command(char c){
		if(c=='<'){
			dir=3;
		}
		else if(c=='>'){
			dir=1;
		}
		else if(c=='^'){
			dir=0;
		}
		else if(c=='v'){
			dir=2;
		}
		else if(c=='_'){
			if(memory==0){
				dir=1;
			}
			else{
				dir=3;
			}
		}
		else if(c=='|'){
			if(memory==0){
				dir=2;
			}
			else{
				dir=0;
			}
		}
		else if(c>='0'&&c<='9'){
			memory=(c-'0');
		}
		else if(c=='+'){
			memory=(memory+1)%16;
		}
		else if(c=='-'){
			memory=(memory+16-1)%16;
		}
	}
}