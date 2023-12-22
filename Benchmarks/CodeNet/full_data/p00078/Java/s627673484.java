import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int[][] map=new int[n][n];
			int px=n/2,py=n/2+1;

			map[px][py]=1;
			for(int i=2;i<=n*n;i++){
				px=(px+1)%n;py=(py+1)%n;
				while(map[px][py]!=0){
					px=(px-1+n)%n;py=(py+1)%n;
				}
				map[px][py]=i;
			}
			for(int y=0;y<n;y++){
				for(int x=0;x<n;x++){
					pr(String.format("% 4d",map[x][y]));
				}
				ln();
			}
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