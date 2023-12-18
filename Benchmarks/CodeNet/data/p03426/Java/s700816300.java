import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int d=sc.nextInt();
		int[][] a=new int[h][w];

		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int magic[]=new int[h*w+1];
		boolean used[][]=new boolean[h][w];
		for(int i=0;i<h;i++) {
LOOP:			for(int j=0;j<w;j++) {
				if(a[i][j]>h*w-d)continue;
				else if(used[i][j])continue;
				for(int x=0;x<h;x++) {
					for(int y=0;y<w;y++) {
						if(a[i][j]-a[x][y]==d) {
							magic[a[x][y]]=Math.abs(x-i)+Math.abs(y-j);
							used[x][y]=true;
							continue LOOP;
						}
						else if(a[i][j]-a[x][y]==-d) {
							magic[a[i][j]]=Math.abs(x-i)+Math.abs(y-j);
							continue LOOP;
						}						
					}
				}
			}
		}
		for(int i=h*w-d;i>=0;i--) {
			magic[i]+=magic[i+d];
		}
		int q=sc.nextInt();
		
		for(int i=0;i<q;i++) {
			
			System.out.println(magic[sc.nextInt()]-magic[sc.nextInt()]);
		}
		
		
	}
}
