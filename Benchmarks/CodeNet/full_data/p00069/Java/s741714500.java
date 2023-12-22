import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);
	public void run() {
		dataset:while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)break;
			int m=sc.nextInt()-1,g=sc.nextInt()-1,d=sc.nextInt();
			char[][] map=new char[d][n-1];
			for(int i=0;i<d;i++){
				map[i]=sc.next().toCharArray();
			}
			int[][] root=new int[d+1][n];
			int[] state=new int[n];
			for(int i=0;i<n;i++)state[i]=i;
			for(int i=0;i<d;i++){
				root[i]=Arrays.copyOf(state,n);
				for(int j=0;j<n-1;j++){
					if(map[i][j]=='1'){
						int x=state[j];
						state[j]=state[j+1];
						state[j+1]=x;
					}
				}
			}
			if(m ==state[g]){
				ln(0);
				continue dataset;
			}

			for(int i=0;i<d;i++){
				for(int j=0;j<n-1;j++){
					if(map[i][j]=='0' && (j==0 ||map[i][j-1]=='0') &&( j==n-2 || map[i][j+1]=='0')){
						if(root[i][j]==m && root[i][j+1]==state[g] || root[i][j]==state[g] && root[i][j+1]==m){
							ln((i+1) +" "+(j+1));
							continue dataset;
						}
					}
				}
			}
			ln(1);
			continue dataset;
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}