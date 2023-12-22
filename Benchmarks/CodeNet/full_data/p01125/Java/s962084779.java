import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				if(n==0) break;
				boolean[][] gems=new boolean[21][21];
				for(int i=0; i<n; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					gems[a][b]=true;
				}
				int m=sc.nextInt();
				int nowx=10;
				int nowy=10;
				int nextx=0;
				int nexty=0;
				for(int i=0; i<m; i++) {
					String s=sc.next();
					int num=sc.nextInt();
					if(s.equals("N")) {
						nextx=nowx;
						nexty=nowy+num;
					}
					else if(s.equals("E")) {
						nextx=nowx+num;
						nexty=nowy;
					}
					else if(s.equals("S")) {
						nextx=nowx;
						nexty=nowy-num;
					}
					else if(s.equals("W")) {
						nextx=nowx-num;
						nexty=nowy;
					}
					for(int x=Math.min(nowx, nextx); x<=Math.max(nowx, nextx); x++) {
						for(int y=Math.min(nexty, nowy); y<=Math.max(nexty, nowy); y++) {
							if(gems[x][y]) {
								gems[x][y]=false;
							}
						}
					}
					nowx=nextx;
					nowy=nexty;
				}
				int flag=0;
				for(int i=0; i<=20; i++) {
					for(int j=0; j<=20; j++) {
						if(gems[i][j]) {
							flag=1;
						}
					}
				}
				System.out.println((flag==1)? "No":"Yes");
			}
		}
	}
} 
