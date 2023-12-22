import java.io.*;
import java.util.*;
public class Main {
	static char[][] arr;
	static int n,m;
	static int dn,dm,cn,cm;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=1;//sc.nextInt();
		while(t-->0) {
			n=sc.nextInt();m=sc.nextInt();
			cn=sc.nextInt();cm=sc.nextInt();
			dn=sc.nextInt();dm=sc.nextInt();
			dn--;cn--;dm--;cm--;
			arr=new char[n][m];
			for(int i=0;i<n;i++) {
				arr[i]=sc.next().toCharArray();
			}
			LinkedList<Integer> xqu=new LinkedList<>();
			LinkedList<Integer> yqu=new LinkedList<>();
			xqu.add(cn);yqu.add(cm);
			int[][] dist=new int[n][m];
			//System.out.println(dist.length);
			for(int i=0;i<n;i++) {
				Arrays.fill(dist[i], Integer.MAX_VALUE);
			}
			dist[cn][cm]=0;
			while(xqu.size()>0) {
				int x=xqu.pollFirst();
				int y=yqu.pollFirst();
				int[][] dr= {{0,1},{0,-1},{1,0},{-1,0}};
				for(int[] d:dr) {
					int nx=x+d[0];int ny=y+d[1];
					if(!islegal(nx,ny)) continue;
					if(dist[nx][ny]>dist[x][y]) {
						dist[nx][ny]=dist[x][y];
						xqu.addFirst(nx);
						yqu.addFirst(ny);
					}
				}
				for(int i=x-2;i<=x+2;i++) {
					for(int j=y-2;j<=y+2;j++) {
						int nx=i;int ny=j;
						if(!islegal(nx,ny)) continue;
						
						if(dist[nx][ny]>dist[x][y]+1) {
							dist[nx][ny]=dist[x][y]+1;
							xqu.addLast(nx);
							yqu.addLast(ny);
						}
					}
				}
			}
			System.out.println(dist[dn][dm]==Integer.MAX_VALUE? -1:dist[dn][dm]);
		}

	}
	static boolean islegal(int x,int y) {
		if(x<0 || y<0 ||x>=n || y>=m) return false;
		if(arr[x][y]=='#') return false;
		return true;
	}
	static class node{
		int x,y,k;
		node(int x,int y){
			this.x=x;this.y=y;
			this.k=0;
		}
	}

}
/*class Reader{
	BufferedReader reader;
	Reader(){
		reader=new BufferedReader(new InputStreamReader(System.in));
	}
	int nextInt() throws IOException{
		String in=reader.readLine().trim();
		return Integer.parseInt(in);
	}
	long nextLong() throws IOException{
		String in=reader.readLine().trim();
		return Long.parseLong(in);
	}
	String next() throws IOException{
		return reader.readLine().trim();
	}
	String[] stringArray() throws IOException{
		return reader.readLine().trim().split("\\s+");
	}
	int[] intArray() throws IOException{
		String[] inp=this.stringArray();
		int[] arr=new int[inp.length];
		int i=0;
		for(String s:inp) {
			arr[i++]=Integer.parseInt(s);
		}
		return arr;
	}
}*/


