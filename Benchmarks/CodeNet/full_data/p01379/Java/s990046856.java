import java.util.Scanner;
import java.util.Stack;

public class Main {

	static byte H,W,memory,dir;
	static char[][] field;
	static byte[][][][] dp;
	static int[] v1={-1,0,1,0};
	static int[] v2={0,1,0,-1};
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		H=cin.nextByte();
		W=cin.nextByte();
		memory=0;
		dir=1;
		field=new char[H][];

		//memory, dir 
		dp=new byte[H][W][16][4];
		
		for(int i=0;i<H;i++){
			field[i]=cin.next().toCharArray();
		}
		boolean ans=false;
		Stack<byte[]>stack=new Stack<byte[]>();
		stack.push(new byte[]{0,0,0,1});
		while(!stack.isEmpty()){
			byte[] a = stack.pop();
			
			byte x=a[0];
			byte y=a[1];
			byte memory=a[2];
			byte dir=a[3];
//			System.out.println(x+" "+y+" "+memory+" "+dir);
			if(dp[x][y][memory][dir]==1){
				continue;
			}
			dp[x][y][memory][dir]=1;
			if(field[x][y]=='@'){
				ans=true;
				break;
			}
			else if(field[x][y]=='?'){
				byte tmpdir=dir;
				byte tmpmem=memory;
				
				for(byte i=0;i<4;i++){
					dir=i;
					byte[] next=step(x,y,dir);
					stack.add(new byte[]{next[0],next[1],memory,dir});
				}
				dir=tmpdir;
				memory=tmpmem;
			}
			else{
				byte tmpdir=dir;
				byte tmpmem=memory;
				byte[] b = command(field[x][y],memory,dir);
				memory=b[0];
				dir=b[1];
				byte[] next=step(x,y,dir);
//				System.out.println(memory+" "+dir+" "+x+" "+y);
//				System.out.println(next[0]+" "+next[1]);
				stack.add(new byte[]{next[0],next[1],memory,dir});
				dir=tmpdir;
				memory=tmpmem;
			}
		}
		/*
		if(dp(0,0)){
			System.out.println("YES");
		}
				else{
			System.out.println("NO");
		}*/
		if(ans){
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
			byte tmpdir=dir;
			byte tmpmem=memory;
			
			for(byte i=0;i<4;i++){
				dir=i;
				byte[] next=step(x,y);
				if(dp(next[0],next[1])){
					return true;
				}
			}
			dir=tmpdir;
			memory=tmpmem;
		}
		else{
			byte tmpdir=dir;
			byte tmpmem=memory;
			command(field[x][y]);
			byte[] next=step(x,y);
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
	
	static byte[] step(int x,int y){
		byte[] re=new byte[2];
		re[0]=(byte)((x+H+v1[dir])%H);
		re[1]=(byte)((y+W+v2[dir])%W);
		return re;
	}
	static byte[] step(int x,int y,byte dir){
		byte[] re=new byte[2];
		re[0]=(byte)((x+H+v1[dir])%H);
		re[1]=(byte)((y+W+v2[dir])%W);
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
			memory=(byte)(c-'0');
		}
		else if(c=='+'){
			memory=(byte)((memory+1)%16);
		}
		else if(c=='-'){
			memory=(byte)((memory+16-1)%16);
		}
	}
	static byte[] command(char c,byte memory,byte dir){
		byte[] re={0,0};
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
			memory=(byte)(c-'0');
		}
		else if(c=='+'){
			memory=(byte)((memory+1)%16);
		}
		else if(c=='-'){
			memory=(byte)((memory+16-1)%16);
		}
		re[0]=memory;
		re[1]=dir;
		return re;
	}
}