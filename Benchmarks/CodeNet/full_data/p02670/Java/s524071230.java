import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int[][][] array = new int[n][n][4];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j][0]=i;
				array[i][j][3]=j;
				array[i][j][1]=n-j-1;
				array[i][j][2]=n-i-1;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int id = sc.nextInt()-1;
				int y=id%n;
				int x =(id-y)/n;
				int min = n+1;
				for(int k=0;k<4;k++) {
					if(array[x][y][k]<min) min=array[x][y][k];
				}
				count+=min;
				int[] dx= {1,0,-1,0}, dy= {0,-1,0,1};
				for(int k=0;k<4;k++) {
					int tx=x,ty=y;
					while(tx+dx[k]>=0 && tx+dx[k]<n && ty+dy[k]>=0 && ty+dy[k]<n) {
						array[tx+dx[k]][ty+dy[k]][k]--;
						tx+=dx[k];
						ty+=dy[k];
					}
				}
			}
		}
		sc.close();
		System.out.println(count);
	}
}