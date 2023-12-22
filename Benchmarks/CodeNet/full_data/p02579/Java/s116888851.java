
import java.util.*;


public class Main{
	
	static char[][] map;
	
	static int h;
	static int w;
	static int ch;
	static int cw;
	static int dh;
	static int dw;
	static int [][] newmap;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		h=sc.nextInt();
		w=sc.nextInt();
		ch=sc.nextInt()-1;
		cw=sc.nextInt()-1;
		dh=sc.nextInt()-1;
		dw=sc.nextInt()-1;
		
		map=new char[h][w];
		
		for(int i=0;i<h;i++) {
			String s=sc.next();
			for(int j=0;j<w;j++) {
				map[i][j]=s.charAt(j);
			}
		}
		
		newmap=new int[h][w];
		boolean first=true;
		for(int r=0;r<h;r++) {
			for(int c=0;c<w;c++) {
				if(map[r][c]=='#')continue;
				if(first) {
					newmap[r][c]=1;
					first=false;
				}
				else if(r==0) {
					if(newmap[r][c-1]>0)newmap[r][c]=newmap[r][c-1];
					else newmap[r][c]=search(r,c);
					//System.out.println("a "+search(r,c));
				}
				else if(c==0){
					if(newmap[r-1][c]>0)newmap[r][c]=newmap[r-1][c];
					else newmap[r][c]=search(r,c);
				}else {
					int a=-1;int b=-1;
					if(newmap[r][c-1]>0)a=newmap[r][c-1];
					if(newmap[r-1][c]>0)b=newmap[r-1][c];
					if(a==-1)newmap[r][c]=b;
					else if(b==-1)newmap[r][c]=a;
					else newmap[r][c]=Math.min(a, b);
					if(newmap[r][c-1]<=0 && newmap[r-1][c]<=0)newmap[r][c]=search(r,c);
				}
				//System.out.println("r "+r+" c "+c+" nmap "+newmap[r][c]);
			}
		}
		int ans=0;
		if(newmap[dh][dw]<=0 || newmap[ch][cw]<0)ans=-1;
		else ans=newmap[dh][dw]-newmap[ch][cw];
		//System.out.println("goal "+newmap[dh][dw]+" start "+newmap[ch] [cw]);
		System.out.println(ans);
	
	}
	
	static int search(int r, int c) {
		int rstart=Math.max(0, r-2);
		int rg=Math.max(h-1, r+2);
		int cstart=Math.max(0, c-2);
		int cg=Math.max(w-1, c+2);
		int ans=1000000000;
		for(int i=rstart; i<=rg;i++) {
			for(int j=cstart; j<cg;j++) {
				if(newmap[i][j]>0)ans=Math.min(ans, newmap[i][j]);
			}
		}
		if(ans==1000000000)return -1;
		else return ans+1;
		
	}
}
