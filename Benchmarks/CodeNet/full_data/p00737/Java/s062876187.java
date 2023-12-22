import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main{
	static int[][] map=new int[30][30];  //?????????
	static int ch, cw, cd;
	static int h, w;  //map?????????
	static Node[][][] node;  //?????????
	static PriorityQueue<Node> open_queue;
	static Node currentNode;  //?¨?????????????



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c0,c1,c2,c3;  //??´????????????????????¢?????????

		while(true){
			w=sc.nextInt();
			h=sc.nextInt();

			if(w==0 && h==0){break;}

			for(int i=0;i<h;i++){  //??????????????±??????
				for(int j=0;j<w;j++){
					map[i][j]=sc.nextInt();
				}
			}
			c0=sc.nextInt();
			c1=sc.nextInt();
			c2=sc.nextInt();
			c3=sc.nextInt();

			node=new Node[h][w][4];  //?????\??????
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					for(int k=0;k<4;k++){
						node[i][j][k]=new Node();
						node[i][j][k].Nh=i;
						node[i][j][k].Nw=j;
						node[i][j][k].Nd=k;
					}
				}
			}
			for(int k=0;k<4;k++){
				node[0][0][k].Start=true;
				node[h-1][w-1][k].Goal=true;
			}

			for(int i=0;i<h;i++){  //???????????\??????
				for(int j=0;j<w;j++){
					for(int k=0;k<4;k++){
						if(k==0){node[i][j][k].cost=c0;}
						else if(k==1){node[i][j][k].cost=c1;}
						else if(k==2){node[i][j][k].cost=c2;}
						else if(k==3){node[i][j][k].cost=c3;}
					}
				}
			}

			for(int i=0;i<h;i++){   //map??¨?????´???????????????0
				for(int j=0;j<w;j++){
					for(int k=0;k<4;k++){
						if(map[i][j]==0){node[i][j][0].cost=0;}
						else if(map[i][j]==1){node[i][j][1].cost=0;}
						else if(map[i][j]==2){node[i][j][2].cost=0;}
						else if(map[i][j]==3){node[i][j][3].cost=0;}
					}
				}
			}

			Dykstra();
		}
	}

	static void Dykstra(){
		open_queue = new PriorityQueue<Node>(1, new MyComparator());
		open_queue.add(node[0][0][0]);
		node[0][0][0].f=0;
		while(true){
			currentNode=open_queue.poll();
			if(currentNode.Goal==true){
				//System.out.println("H:"+currentNode.Nh+" W:"+currentNode.Nw+" D:"+currentNode.Nd);
				break;
			}
			Calc();
		}
		System.out.println(currentNode.f);
	}
	static void Calc(){
		ch=currentNode.Nh;
		cw=currentNode.Nw;
		cd=currentNode.Nd;  //0??? 1??? 2??? 3???
		//System.out.println(currentNode.f);

		if(ch>0){  //??????
			if(cd==0){
				if(node[ch-1][cw][2].f>currentNode.f+node[ch][cw][3].cost){
					node[ch-1][cw][2].f=currentNode.f+node[ch][cw][3].cost;  //???????????????????????????
					open_queue.add(node[ch-1][cw][2]);
				}
			}
			else if(cd==1){
				if(node[ch-1][cw][2].f>currentNode.f+node[ch][cw][1].cost){
					node[ch-1][cw][2].f=currentNode.f+node[ch][cw][1].cost; //???????????????????????????
					open_queue.add(node[ch-1][cw][2]);
				}
			}
			else if(cd==2){
				if(node[ch-1][cw][2].f>currentNode.f+node[ch][cw][0].cost){
					node[ch-1][cw][2].f=currentNode.f+node[ch][cw][0].cost; //???????????´???????????????
					open_queue.add(node[ch-1][cw][2]);
				}
			}
			else if(cd==3){
				if(node[ch-1][cw][2].f>currentNode.f+node[ch][cw][2].cost){
					node[ch-1][cw][2].f=currentNode.f+node[ch][cw][2].cost; //??????????????¢????????????
					open_queue.add(node[ch-1][cw][2]);
				}
			}
		}
		if(ch<h-1){  //??????
			if(cd==0){
				if(node[ch+1][cw][3].f>currentNode.f+node[ch][cw][1].cost){
					node[ch+1][cw][3].f=currentNode.f+node[ch][cw][1].cost;  //???????????????????????????
					open_queue.add(node[ch+1][cw][3]);
				}
			}
			else if(cd==1){
				if(node[ch+1][cw][3].f>currentNode.f+node[ch][cw][3].cost){
					node[ch+1][cw][3].f=currentNode.f+node[ch][cw][3].cost; //???????????????????????????
					open_queue.add(node[ch+1][cw][3]);
				}
			}
			else if(cd==2){
				if(node[ch+1][cw][3].f>currentNode.f+node[ch][cw][2].cost){
					node[ch+1][cw][3].f=currentNode.f+node[ch][cw][2].cost; //??????????????¢????????????
					open_queue.add(node[ch+1][cw][3]);
				}
			}
			else if(cd==3){
				if(node[ch+1][cw][3].f>currentNode.f+node[ch][cw][0].cost){
					node[ch+1][cw][3].f=currentNode.f+node[ch][cw][0].cost; //???????????´???????????????
					open_queue.add(node[ch+1][cw][3]);
				}
			}
		}
		if(cw>0){  //??????
			if(cd==0){
				if(node[ch][cw-1][1].f>currentNode.f+node[ch][cw][2].cost){
					node[ch][cw-1][1].f=currentNode.f+node[ch][cw][2].cost;  //??????????????¢????????????
					open_queue.add(node[ch][cw-1][1]);
				}
			}
			else if(cd==1){
				if(node[ch][cw-1][1].f>currentNode.f+node[ch][cw][0].cost){
					node[ch][cw-1][1].f=currentNode.f+node[ch][cw][0].cost; //???????????´???????????????
					open_queue.add(node[ch][cw-1][1]);
				}
			}
			else if(cd==2){
				if(node[ch][cw-1][1].f>currentNode.f+node[ch][cw][3].cost){
					node[ch][cw-1][1].f=currentNode.f+node[ch][cw][3].cost; //???????????????????????????
					open_queue.add(node[ch][cw-1][1]);
				}
			}
			else if(cd==3){
				if(node[ch][cw-1][1].f>currentNode.f+node[ch][cw][1].cost){
					node[ch][cw-1][1].f=currentNode.f+node[ch][cw][1].cost; //???????????????????????????
					open_queue.add(node[ch][cw-1][1]);
				}
			}
		}
		if(cw<w-1){  //??????
			if(cd==0){
				if(node[ch][cw+1][0].f>currentNode.f+node[ch][cw][0].cost){
					node[ch][cw+1][0].f=currentNode.f+node[ch][cw][0].cost;  //???????????´???????????????
					open_queue.add(node[ch][cw+1][0]);
				}
			}
			else if(cd==1){
				if(node[ch][cw+1][0].f>currentNode.f+node[ch][cw][2].cost){
					node[ch][cw+1][0].f=currentNode.f+node[ch][cw][2].cost; //??????????????¢????????????
					open_queue.add(node[ch][cw+1][0]);
				}
			}
			else if(cd==2){
				if(node[ch][cw+1][0].f>currentNode.f+node[ch][cw][1].cost){
					node[ch][cw+1][0].f=currentNode.f+node[ch][cw][1].cost; //???????????????????????????
					open_queue.add(node[ch][cw+1][0]);
				}
			}
			else if(cd==3){
				if(node[ch][cw+1][0].f>currentNode.f+node[ch][cw][3].cost){
					node[ch][cw+1][0].f=currentNode.f+node[ch][cw][3].cost; //???????????????????????????
					open_queue.add(node[ch][cw+1][0]);
				}
			}
		}
	}
}



class Node{
	int cost; //??´????????????????????¢?????????
	int f; //?????????
	int Nh, Nw, Nd;  //??´?????¨??????
	boolean Start;
	boolean Goal;
	
	public Node(){
		cost=Integer.MAX_VALUE;
		f=Integer.MAX_VALUE;
		Nh=0;
		Nw=0;
		Nd=0;
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