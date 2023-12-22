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
			int[][] map = new int[h+2][w+2];
			int start_w=0,start_h=0;
			for(int i=1;i<=h;++i){
				String line = sc.nextLine();
				String[] line2=line.split("");
				for(int j=0;j<w;++j){
					if(line2[j].equals(".")){
						map[i][j+1]=1;
					} else if(line2[j].equals("@")){
						map[i][j+1]=2;
						start_w=j+1; start_h=i;
					}
				}
			}
			int count=1;
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(new Node(start_h, start_w));
			while(!queue.isEmpty()){
				Node cur = queue.remove();
				if(map[cur.h-1][cur.w]==1){
					count++; map[cur.h-1][cur.w]=0;
					queue.add(new Node(cur.h-1,cur.w));
				}
				if(map[cur.h+1][cur.w]==1){
					count++; map[cur.h+1][cur.w]=0;
					queue.add(new Node(cur.h+1,cur.w));
				}
				if(map[cur.h][cur.w-1]==1){
					count++; map[cur.h][cur.w-1]=0;
					queue.add(new Node(cur.h,cur.w-1));
				}
				if(map[cur.h][cur.w+1]==1){
					count++; map[cur.h][cur.w+1]=0;
					queue.add(new Node(cur.h,cur.w+1));
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
