import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int w=sc.nextInt();
			int h=sc.nextInt();
			String gomi = sc.nextLine();
			if(w==0&&h==0) break;
			int[][] map = new int[h][w];
			int start_w=0,start_h=0;
			for(int i=0;i<h;++i){
				String line = sc.nextLine();
				String[] line2=line.split("");
				for(int j=0;j<w;++j){
					if(line2[j].equals("#")){
						map[i][j]=-1;
					} else if(line2[j].equals("@")){
						map[i][j]=1;
						start_w=j; start_h=i;
					}
				}
			}
			int[][] flag = new int[h][w];
			flag[start_h][start_w]=1;
			int count=1;
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(new Node(start_h, start_w));
			while(!queue.isEmpty()){
				Node cur = queue.remove();
				if(cur.h!=0){
					if(map[cur.h-1][cur.w]==0 && flag[cur.h-1][cur.w]==0){
						count++; flag[cur.h-1][cur.w]=1;
						queue.add(new Node(cur.h-1,cur.w));
					}
				}
				if(cur.h!=h-1){
					if(map[cur.h+1][cur.w]==0 && flag[cur.h+1][cur.w]==0){
						count++; flag[cur.h+1][cur.w]=1;
						queue.add(new Node(cur.h+1,cur.w));
					}
				}
				if(cur.w!=0){
					if(map[cur.h][cur.w-1]==0 && flag[cur.h][cur.w-1]==0){
						count++; flag[cur.h][cur.w-1]=1;
						queue.add(new Node(cur.h,cur.w-1));
					}
				}
				if(cur.w!=w-1){
					if(map[cur.h][cur.w+1]==0 && flag[cur.h][cur.w+1]==0){
						count++; flag[cur.h][cur.w+1]=1;
						queue.add(new Node(cur.h,cur.w+1));
					}
				}
			}
			System.out.println(count);
		}
	}
}
class Node{
	int h,w;
	Node(int w,int h){
		this.h=w;
		this.w=h;
	}
}
