import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
//POJ 1979 DFS
public class Main{
	static int H;
	static int W;
	static int d[][];
	static int num=0;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		H = scan.nextInt();
        W = scan.nextInt();
        int ans=0;
        String maze[][] = new String[H][W];
        d=new int[H][W];
        for(int iH=0;iH<H;iH++){
        	String line=scan.next();
        	String[] spl = line.split("");
            for(int iW=0;iW<W;iW++){
                maze[iH][iW]=spl[iW];
                d[iH][iW]=-1;
            }
        }
        for(int iH=0;iH<H;iH++){
            for(int iW=0;iW<W;iW++){
                if(!(maze[iH][iW].equals("#"))){
                    dfs(iH,iW,maze);
                    System.out.println(iH+","+iW+","+num);
                    if(ans<num) {
                    	ans=num;
                    }
                }
            }
        }
	}
	
	public static void dfs(int sy,int sx,String maze[][]) {
		Queue<Integer[]> queue = new ArrayDeque<>();
        num=1;
		Integer ad[] = {sx,sy};
        queue.add(ad);
        d[sy][sx]=0;
        while (queue.size()>0) {
			Integer get[]=queue.poll();
			int get0=get[0];
			int get1=get[1];
			int LightNx=get0;
			int LeftNx=get0;
			int UpNy=get1;
			int DownNy=get1;
			while (0<=LeftNx-1) {
				if((maze[get1][LeftNx-1].equals("#"))) {
					break;
				}
				LeftNx--;
				num++;
			}
			while (LightNx+1<W) {
				if((maze[get1][LightNx+1].equals("#"))) {
					break;
				}
				LightNx++;
				num++;
			}
			while (0<=UpNy-1) {
				if((maze[UpNy-1][get0].equals("#"))) {
					break;
				}
				UpNy--;
				num++;
			}
			while (DownNy+1<H) {
				if((maze[UpNy+1][get0].equals("#"))) {
					break;
				}
				DownNy++;
				num++;
			}
			
		}
	}
}