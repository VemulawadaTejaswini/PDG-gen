import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		
		int h=s.nextInt(),w=s.nextInt();
		char[][]f=new char[h][w];
		for(int i=0;i<h;++i)
			f[i]=s.next().toCharArray();
		
		UF uf=new UF(h*w);
		
		int[]white=new int[h*w];
		int[]black=new int[h*w];
		
		for(int i=0;i<h;++i) {
			for(int j=0;j<w;++j) {
				for(int d=0;d<4;++d){
					int y=i+dy[d];
					int x=j+dx[d];
					if(0<=y&&y<h&&0<=x&&x<w&&f[i][j]!=f[y][x])
						uf.connect(i*w+j,y*w+x);
				}
			}
		}
		
		for(int i=0;i<h;++i) {
			for(int j=0;j<w;++j) {
				(f[i][j]=='.'?white:black)[uf.root(i*w+j)]++;
			}
		}
		
		long r=0;
		for(int i=0;i<h*w;++i) {
			if(uf.root(i)==i) {
				r+=white[i]*black[i];
			}
		}
		System.out.println(r);
	}
	static int[] dx= {0,1,0,-1};
	static int[] dy= {1,0,-1,0};
}


class UF{
	public int[] uni;
	public UF(int size){
		Arrays.fill(uni=new int[size],-1);
	}
	public int root(int t){
		return uni[t]<0?t:(uni[t]=root(uni[t]));
	}
	public boolean connect(int p,int c){
		p=root(p);
		c=root(c);
		if(p==c)
			return false;
		if(uni[p]>uni[c]){
			int buf=c;
			c=p;
			p=buf;
		}
		uni[p]+=uni[c];
		uni[c]=p;
		return true;
	}
	public boolean isConnected(int a,int b){
		return root(a)==root(b);
	}
	public int groupSize(int t){
		return -uni[root(t)];
	}
}
