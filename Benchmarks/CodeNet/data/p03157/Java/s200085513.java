import java.io.*;
import java.util.*;
public class Main {
	static int id=1;
	public static void main(String[] args) {
	
		MyScanner sc = new MyScanner();
		int h=sc.nextInt();
		int w=sc.nextInt();
		String  s[]=new String[h];
		for (int k=0;k<h;k++) {
			s[k]=sc.next();
		}
		int imf[][]=new int[h][w];
		for(int x=0;x<h;x++) {
			for(int y=0;y<w;y++) {
				imf[x][y]=0;
			} //初期化
		}	
		int num[][]=new int[160000][2];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(imf[i][j]==0) {
					create(num,imf,s,i,j,h,w,id);
				}
			}
		}
		// グループ化終了
		long ans=0;
		for (int a=1;a<=id;a++) {
			ans+=num[a][0]*num[a][1];
			System.out.println(id+","+num[id][0]+","+num[id][1]);
		}
		System.out.println(ans);
		}
		
	public static void create(int[][] num,int[][] imf,String[] s,int i,int j,int h,int w,int id) {
		if(imf[i][j]==0) {
			if(s[i].charAt(j)=='#') {
				num[id][0]++;
			}
			else {
				num[id][1]++;
			}
		}
		imf[i][j]=id;
		
		if(j!=w-1||i!=h-1) {
			if(j!=w-1) {
				if (s[i].charAt(j+1)!=s[i].charAt(j)) {
					create(num,imf,s,i,j+1,h,w,id);
					
				}
			}	
			if(i!=h-1) {
				if (s[i+1].charAt(j)!=s[i].charAt(j)) {
					create(num,imf,s,i+1,j,h,w,id);
				
				}
			}
		}
		else {
			plus();
			
		}
	}
	public static void plus() {
		id++;
	}
	public static PrintWriter out;

	public static class MyScanner {
		BufferedReader br;
		StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

	}
	

}



