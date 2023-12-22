
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main{
	static Node[][] node;  //ノード
	static PriorityQueue<Node> open_queue;
	static Node currentNode;  //計算ノード
	static int ch, cw;
	static int h, w;  //高さ、幅
	static int[][] rWall;
	static int[][] dWall;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true){
			int count=0;

			w=sc.nextInt();
			h=sc.nextInt();

			if(w==0 && h==0){
				break;
			}

			rWall= new int[h][w];
			dWall= new int[h][w];

			for(int k=0;k<2*h-1;k++){
				if(k%2==0){
					for(int i=0;i<w-1;i++){
						rWall[count][i]=sc.nextInt();
					}
				}
				else{
					for(int i=0;i<w;i++){
						dWall[count][i]=sc.nextInt();
					}
					count++;
				}
			}

			node=new Node[h][w];  //ノード生成
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					node[i][j]=new Node();
					node[i][j].Nh=i;
					node[i][j].Nw=j;
				}
			}

			MazeCalc();
		}
	}

	static void MazeCalc(){
		node[0][0].Start=true;
		node[h-1][w-1].Goal=true;
		node[0][0].f=0;
		open_queue = new PriorityQueue<Node>(1, new MyComparator());
		open_queue.add(node[0][0]);
		while(true){
			if(open_queue.size()==0){
				System.out.println(0);
				break;
			}
			currentNode=open_queue.poll();
			if(currentNode.Goal==true){
				System.out.println(currentNode.f+1);
				break;
			}
			Calc();
		}
	}
	static void Calc(){
		ch=currentNode.Nh;
		cw=currentNode.Nw;
		if(ch>0){
			if(dWall[ch-1][cw]==0 && node[ch-1][cw].f>currentNode.f+1){
				node[ch-1][cw].f=currentNode.f+1;
				open_queue.add(node[ch-1][cw]);
			}
		}
		if(ch<h-1){
			if(dWall[ch][cw]==0 && node[ch+1][cw].f>currentNode.f+1){
				node[ch+1][cw].f=currentNode.f+1;
				open_queue.add(node[ch+1][cw]);
			}

		}
		if(cw>0){
			if(rWall[ch][cw-1]==0 && node[ch][cw-1].f>currentNode.f+1){
				node[ch][cw-1].f=currentNode.f+1;
				open_queue.add(node[ch][cw-1]);
			}
		}
		if(cw<w-1){
			if(rWall[ch][cw]==0 && node[ch][cw+1].f>currentNode.f+1){
				node[ch][cw+1].f=currentNode.f+1;
				open_queue.add(node[ch][cw+1]);
			}
		}
	}

}

class Node{
	int cost; //直進、右折、反転、左折
	int f; //コスト
	int Nh, Nw;  //場所と向き
	boolean Start;
	boolean Goal;

	public Node(){
		cost=Integer.MAX_VALUE;
		f=Integer.MAX_VALUE;
		Nh=0;
		Nw=0;
		Start=false;
		Goal=false;
	}
}

class MyComparator implements Comparator<Object>{
    public int compare(Object obj1, Object obj2) {

        Node num1 = (Node)obj1;
        Node num2 = (Node)obj2;

        if(num1.f>num2.f) {
            return 1;
        } else if(num1.f<num2.f) {
            return -1;
        } else{
            return 0;
        }
    }
}