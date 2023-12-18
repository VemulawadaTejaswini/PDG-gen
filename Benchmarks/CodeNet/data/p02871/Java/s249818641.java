import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Node {
	ArrayList<Node> edgeTo = new  ArrayList<Node>();
	ArrayList<Integer> edgeCost = new  ArrayList<Integer>();
	Map<Node,Integer> edge =new HashMap<Node,Integer>(){};
	Boolean done=false;
	int cost=-1;
	int id;
	Node previousNode=null;
	
	public Node(int n) {
		id=n;
	}
	
	public void resetNode() {
		done=false;
		cost=-1;
		previousNode=null;
	}
	
	public void addNode(Node n,int c) {
		edgeTo.add(n);
		edgeCost.add(c);
		edge.put(n,c);
	}
	
	public void getNode() {
		for(int i=0;i<edgeTo.size();i++) {
			System.out.print(edgeTo.get(i).id+1+" ");
		}
		System.out.println();
	}
	
}

class Car{
	int n_pos;	//迴ｾ蝨ｨ蝨ｰ
	int g_pos;	//逶ｮ逧�蝨ｰ
	int dis;
	int V;
	Map<Integer,Integer> trunk =new HashMap<Integer,Integer>(){};
	
	public Car(int n_p,int g_p,int d,int v){
		n_pos=n_p;
		g_pos=g_p;
		dis=d;
		V=v;
	}
	public void setn_pos(int n){
		n_pos=n;
	}
	
	public void setg_pos(int n){
		g_pos=n;
	}
	
	public void setdis(int n){
		dis=n;
	}

	public void adddis(){
		dis+=1;
	}

	public int getn_pos(){
		return n_pos;
	}

	public int getg_pos(){
		return g_pos;
	}

	public int getdis(){
		return dis;
	}

	public void addBaggage(int u,int d){
		trunk.put(u,d);
	}

	public void printBaggage(){
		Set<Integer> KeySet = trunk.keySet();
		System.out.println(KeySet);
	}
	
	public boolean checkPos() {
		if(dis==0) return true;
		else return false;
	}
	
}

public class Main {
	public static void cul(int V,Node[] nodes,int s) {
		//蟋狗せ縺ｮ險ｭ螳�
		nodes[s].cost=0;
				
		//邨瑚ｷｯ謗｢邏｢--------------------------
		while(true) {
			//蜃ｦ逅�荳ｭ縺ｮ繝弱�ｼ繝�
			Node processNode =null;
					
			for(int i=0;i<V;i++) {
				Node node =nodes[i];
						
				//險ｪ蝠乗ｸ医∩蜿医�ｯ繧ｳ繧ｹ繝域悴險ｭ螳壹↑繧峨せ繧ｭ繝�繝�
				if(node.done ||node.cost<0) continue;
						
				if(processNode==null) {
					processNode = node;
					continue;
				}
						
				//遒ｺ螳壹＠縺ｦ縺ｪ縺�繝弱�ｼ繝峨°繧我ｸ�逡ｪ蟆上＆縺�繧ｳ繧ｹ繝医�ｮ繝弱�ｼ繝峨ｒ謗｢縺�
				if(node.cost<processNode.cost) processNode=node;
				}
					
				if(processNode==null) break;
					
				processNode.done=true;
					
				for(int i=0;i<processNode.edgeTo.size(); i++) {
					Node node = processNode.edgeTo.get(i);
					int cost = processNode.cost+processNode.edgeCost.get(i);
						
					if((node.cost<0)||(node.cost>cost)) {
						node.cost=cost;
						node.previousNode=processNode;
					}
				}
					
			}
	}
	
	public static void printNode(Node[] nodes,int g,Integer key) {
		//邨瑚ｷｯ蜃ｺ蜉�
		Node goal=nodes[g];
		Node current = goal;
		System.out.print(key+": "+current.id);
		while(true) {
			Node next=current.previousNode;
			if(current.previousNode==null) {
				System.out.println();
				break;
			}
			else{
				System.out.print("<-"+next.id);
				current=next;
			}
		}
	}
	
	public static int culLength(Node[] nodes,int g) {
		Node goal=nodes[g];
		Node current = goal;
		int len=0;
		while(true) {
			Node next=current.previousNode;
			if(current.previousNode==null) {
				break;
			}
			else{
				len+=current.cost;
				current=next;
			}
		}
		return len;
	}
	
	public static int culNextNode(Node[] nodes,int g) {
		Node goal=nodes[g];
		Node current = goal;
		int next_node=current.id;
		while(true) {
			Node next=current.previousNode;
			if(current.previousNode==null) {
				//System.out.println("next node=>"+next_node);
				break;
			}
			else{
				next_node=current.id;
				current=next;
			}
		}
		return next_node;
	}
	
	public static void main(String args[]) {
		int flgall=0;
		int flgans=0;
		Scanner scanner = new Scanner(System.in);
		int V = scanner.nextInt();	
		int E = scanner.nextInt();	
		//System.out.println("蜈･蜉帙＠縺滓焚蛟､縺ｯ " +V +","+E+ " 縺ｧ縺吶��");
		
		//繝阪ャ繝医Ρ繝ｼ繧ｯ菴懈��--------------------
		Node[] nodes=new Node[V];
		for (int i=0;i<V;i++){
			nodes[i]=new Node(i);
		}
		
		for(int i=0;i<E;i++){
			int u = scanner.nextInt();	
			int v = scanner.nextInt();	
			int d = scanner.nextInt();	
			nodes[u-1].addNode(nodes[v-1],d);
			nodes[v-1].addNode(nodes[u-1],d);
		}
		//----------------------------------
		int T=scanner.nextInt();	//郢ｰ繧願ｿ斐＠縺ｮ蝗樊焚
		//豕ｨ譁�縺ｮ邂｡逅�
		Map<Integer,Integer> warehouse =new HashMap<Integer,Integer>(){};
		//Set<Integer> KeySet = warehouse.keySet();
	
		Car car= new Car(0,0,0,V);	//遘ｻ蜍戊ｻ�
		for(int t=0;t<T;t++){
			//System.out.println("start step"+t);
			int N=scanner.nextInt();
			//System.out.println("n_pos "+car.getn_pos()+" g_pos "+car.getg_pos()+" dis "+car.getdis());
			//蛟牙ｺｫ縺ｫ闕ｷ迚ｩ遨阪�
			for(int i=0;i<N;i++){
				int id=scanner.nextInt();
				int dst=scanner.nextInt();
				warehouse.put(id,dst-1);
				flgall++;
			}
			//霆翫′蛟牙ｺｫ縺ｫ縺ゅ▲縺溘ｉ闕ｷ迚ｩ繧堤ｩ阪ｓ縺ｧ蛟牙ｺｫ繧堤ｩｺ縺ｫ縺吶ｋ
			if(car.getn_pos()==0&&car.getg_pos()==0&&car.getdis()==0){
				for(Integer key : warehouse.keySet()){
					car.addBaggage(key,warehouse.get(key));
				}
				warehouse.clear();
			}
			
			//霆翫′蛟牙ｺｫ莉･螟悶�ｮ鬆らせ縺ｫ縺ゅ▲縺ｦ闕ｷ迚ｩ縺御ｸ�閾ｴ縺励※縺溘ｉ闕ｷ髯阪ｍ縺�
			if(car.getn_pos()==car.getg_pos()&&car.getdis()==0){
				List<Integer> list = new ArrayList<Integer>();
				for(Integer key : car.trunk.keySet()){
					if(car.getn_pos()==car.trunk.get(key)) list.add(key);
				}
				for(int i=0;i<list.size();i++) {
					car.trunk.remove(list.get(i));
					flgans++;
				}
			}
			//System.out.println("warehouse "+warehouse.size()+" trunk "+car.trunk.size());
			//霆翫�ｮ陦悟虚豎ｺ螳�
			int start=car.getn_pos();
			int goal=10000;
			int next_cost=100000000;
			int next_node=10000;
			int destination=10000;
			//鬆らせ縺ｮ蝣ｴ蜷�
			if(car.checkPos()==true) {
				start=car.getn_pos();
				//start縺九ｉ譖ｸ縺冗せ縺ｸ縺ｮ邨瑚ｷｯ謗｢邏｢
				cul(V,nodes,start);
				//蛟牙ｺｫ遨ｺ縺ｧ霆願差迚ｩ縺ゅｊ
				if(warehouse.isEmpty()&&!car.trunk.isEmpty()) {
					//System.out.println(car.trunk.size());
					for(Integer key : car.trunk.keySet()){
						goal=car.trunk.get(key);
						//printNode(nodes,goal,key);
						if(culLength(nodes,goal)<next_cost) {
							next_cost=culLength(nodes,goal);
							destination=goal;
							next_node=culNextNode(nodes,destination);
						}
					}
					for(int i=0;i<V;i++) nodes[i].resetNode();
				}
				//蛟牙ｺｫ繧りｻ翫ｂ闕ｷ迚ｩ縺ゅｊ
				else if(!warehouse.isEmpty()&&!car.trunk.isEmpty()) {
					for(Integer key : car.trunk.keySet()){
						goal=car.trunk.get(key);
						//printNode(nodes,goal,key);
						if(culLength(nodes,goal)<next_cost) {
							next_cost=culLength(nodes,goal);
							destination=goal;
							next_node=culNextNode(nodes,destination);
						}
					}
					int cost0=culLength(nodes,0);
					for(int i=0;i<V;i++) nodes[i].resetNode();
					
					cul(V,nodes,0);
					for(Integer key : warehouse.keySet()){
						goal=warehouse.get(key);
						//printNode(nodes,goal,key);
						if(culLength(nodes,goal)+cost0<next_cost) {
							next_cost=culLength(nodes,goal)+cost0;
							destination=0;
							//竊鍋樟蝨ｨ蝨ｰ縺九ｉ0縺ｾ縺ｧ縺ｧ閾ｪ蛻�縺ｮ髫｣縺ｮ繝弱�ｼ繝峨↓遘ｻ蜍輔＆縺帙ｋ�ｼ�ｼ�
							for(int i=0;i<V;i++) nodes[i].resetNode();
							cul(V,nodes,start);
							next_node=culNextNode(nodes,destination);
						}
					}
					for(int i=0;i<V;i++) nodes[i].resetNode();
				}
				//蛟牙ｺｫ縺ｫ闕ｷ迚ｩ縺ゅｋ縺瑚ｻ顔ｩｺ
				else if(!warehouse.isEmpty()&&car.trunk.isEmpty()) {
					next_node=culNextNode(nodes,0);
					destination=0;
					for(int i=0;i<V;i++) nodes[i].resetNode();
				}
				//蛟牙ｺｫ遨ｺ縺ｧ霆翫ｂ遨ｺ
				else {
					//0逡ｪ縺ｫ縺�繧九→縺阪�ｯ蛛懈ｭ｢
					if(car.getn_pos()==0&&car.getdis()==0) {
						destination=-1;
						next_node=-1;
					}
					else {
						destination=0;
						next_node=culNextNode(nodes,0);
					}
					for(int i=0;i<V;i++) nodes[i].resetNode();
				}
				
			}
			//霎ｺ縺ｮ蝣ｴ蜷�
			else {
				//蛟牙ｺｫ遨ｺ縺ｧ霆願差迚ｩ縺ゅｊ
				if(warehouse.isEmpty()&&!car.trunk.isEmpty()) {
					//now->goal
					start=car.getn_pos();
					cul(V,nodes,start);
					for(Integer key : car.trunk.keySet()){
						goal=car.trunk.get(key);
						//printNode(nodes,goal,key);
						if(culLength(nodes,goal)+car.getdis()<next_cost) {
							next_cost=culLength(nodes,goal)+car.getdis();
							destination=goal;
						}
					}
					next_node=start;
					for(int i=0;i<V;i++) nodes[i].resetNode();
					
					//蜿榊ｯｾ譁ｹ蜷醍沿 goal-> now
					start=car.getg_pos();
					cul(V,nodes,start);
					for(Integer key : car.trunk.keySet()){
						goal=car.trunk.get(key);
						//printNode(nodes,goal,key);
						int tmp=nodes[car.getn_pos()].edgeTo.indexOf(nodes[car.getg_pos()]);
						if(culLength(nodes,goal)+(nodes[car.getn_pos()].edgeCost.get(tmp)-car.getdis())<next_cost) {
							next_cost=culLength(nodes,goal)+(nodes[car.getn_pos()].edgeCost.get(tmp)-car.getdis());
							destination=goal;
						}
					}
					next_node=start;
					for(int i=0;i<V;i++) nodes[i].resetNode();
				}
				//蛟牙ｺｫ繧りｻ翫ｂ闕ｷ迚ｩ縺ゅｊ
				else if(!warehouse.isEmpty()&&!car.trunk.isEmpty()) {
					//縺昴�ｮ縺ｾ縺ｾ騾ｲ繧�蝣ｴ蜷医�ｮ譛�遏ｭ霍晞屬讀懃ｴ｢
					//now->goal
					start=car.getn_pos();
					cul(V,nodes,start);
					for(Integer key : car.trunk.keySet()){
						
						goal=car.trunk.get(key);
						//printNode(nodes,goal,key);
						if(culLength(nodes,goal)+car.getdis()<next_cost) {
							next_cost=culLength(nodes,goal)+car.getdis();
							destination=goal;
						}
					}
					next_node=start;
					for(int i=0;i<V;i++) nodes[i].resetNode();
					
					//蜿榊ｯｾ譁ｹ蜷醍沿 goal-> now
					start=car.getg_pos();
					cul(V,nodes,start);
					for(Integer key : car.trunk.keySet()){
						
						goal=car.trunk.get(key);
						//printNode(nodes,goal,key);
						int tmp=nodes[car.getn_pos()].edgeTo.indexOf(nodes[car.getg_pos()]);
						if(culLength(nodes,goal)+(nodes[car.getn_pos()].edgeCost.get(tmp)-car.getdis())<next_cost) {
							next_cost=culLength(nodes,goal)+(nodes[car.getn_pos()].edgeCost.get(tmp)-car.getdis());
							destination=goal;
						}
					}
					next_node=start;
					for(int i=0;i<V;i++) nodes[i].resetNode();
					
					//蛟牙ｺｫ縺ｫ謌ｻ縺｣縺溷�ｴ蜷医�ｮ譛�遏ｭ霍晞屬謗｢縺�
					int cost0;
					int tmp_node=100000;
					
					cul(V,nodes,car.getn_pos());
					cost0=culLength(nodes,0);
					tmp_node=car.getn_pos();
					for(int i=0;i<V;i++) nodes[i].resetNode();
					
					cul(V,nodes,car.getg_pos());
					if(cost0>culLength(nodes,0)) {
						cost0=culLength(nodes,0);
						tmp_node=car.getg_pos();
					}
					for(int i=0;i<V;i++) nodes[i].resetNode();
					
					cul(V,nodes,0);
					for(Integer key : warehouse.keySet()){
						goal=warehouse.get(key);
						//printNode(nodes,goal,key);
						if(culLength(nodes,goal)+cost0<next_cost) {
							next_cost=culLength(nodes,goal)+cost0;
							destination=0;
							next_node=tmp_node;
						}
					}
					for(int i=0;i<V;i++) nodes[i].resetNode();
				}
				
				//蛟牙ｺｫ縺ｫ闕ｷ迚ｩ縺ゅｋ縺瑚ｻ顔ｩｺ
				else if(!warehouse.isEmpty()&&car.trunk.isEmpty()) {
					//now->goal
					start=car.getn_pos();
					cul(V,nodes,start);
					goal=0;
					//printNode(nodes,goal,0);
					if(culLength(nodes,goal)+car.getdis()<next_cost) {
						next_cost=culLength(nodes,goal)+car.getdis();
					}
					next_node=start;
					for(int i=0;i<V;i++) nodes[i].resetNode();
					
					//蜿榊ｯｾ譁ｹ蜷醍沿 goal-> now
					start=car.getg_pos();
					cul(V,nodes,start);
					goal=0;
					//printNode(nodes,goal,0);
					int tmp=nodes[car.getn_pos()].edgeTo.indexOf(nodes[car.getg_pos()]);
					if(culLength(nodes,goal)+(nodes[car.getn_pos()].edgeCost.get(tmp)-car.getdis())<next_cost) {
						next_cost=culLength(nodes,goal)+(nodes[car.getn_pos()].edgeCost.get(tmp)-car.getdis());
					}
					next_node=start;
					for(int i=0;i<V;i++) nodes[i].resetNode();
					destination=0;
				}
				//蛟牙ｺｫ遨ｺ縺ｧ霆翫ｂ遨ｺ
				else {
					//0逡ｪ縺ｫ縺�繧九→縺阪�ｯ蛛懈ｭ｢
					//now->goal
					start=car.getn_pos();
					cul(V,nodes,start);
					goal=0;
					//printNode(nodes,goal,0);
					if(culLength(nodes,goal)+car.getdis()<next_cost) {
						next_cost=culLength(nodes,goal)+car.getdis();
					}
					next_node=start;
					for(int i=0;i<V;i++) nodes[i].resetNode();
						
					//蜿榊ｯｾ譁ｹ蜷醍沿 goal-> now
					start=car.getg_pos();
					cul(V,nodes,start);
					goal=0;
					//printNode(nodes,goal,0);
					int tmp=nodes[car.getn_pos()].edgeTo.indexOf(nodes[car.getg_pos()]);
					if(culLength(nodes,goal)+(nodes[car.getn_pos()].edgeCost.get(tmp)-car.getdis())<next_cost) {
						next_cost=culLength(nodes,goal)+(nodes[car.getn_pos()].edgeCost.get(tmp)-car.getdis());
					}
					next_node=start;
					for(int i=0;i<V;i++) nodes[i].resetNode();
					destination=0;
				}
			}
			//System.out.println("next_node"+next_node+" destination"+destination);
			//System.out.println(next_node);
			/*try{
				FileWriter file = new FileWriter("/home/ph4nul/繝�繧ｦ繝ｳ繝ｭ繝ｼ繝�/toolkitA/result.out",true);
				PrintWriter pw = new PrintWriter(new BufferedWriter(file));
				if(next_node==-1) pw.println(next_node);
				else pw.println(next_node+1);
				pw.close();
				System.out.println("finished step"+t);
			}
			catch(IOException e) {
				e.printStackTrace();
			}*/
			
			if(next_node==-1) System.out.println(next_node);
			else System.out.println(next_node+1);
			
			//霆翫�ｮ遘ｻ蜍�
			//鬆らせ縺ｮ蝣ｴ蜷�
			if(car.checkPos()==true) {
				if(next_node==-1) continue;
				car.setg_pos(next_node);
				car.adddis();
				//霍晞屬縺梧ｬ｡縺ｮ繝弱�ｼ繝峨∪縺ｧ縺ｮedgeCost縺ｨ荳�閾ｴ縺励◆繧牙芦逹�蜃ｦ逅�
				int tp=nodes[car.getn_pos()].edgeTo.indexOf(nodes[car.getg_pos()]);
				if(car.getdis()==nodes[car.getn_pos()].edgeCost.get(tp)) {
					car.setn_pos(car.getg_pos());
					car.setdis(0);
				}
			}
			//霎ｺ縺ｮ蝣ｴ蜷�
			else {
				//騾ｲ陦梧婿蜷代◎縺ｮ縺ｾ縺ｾ
				if(next_node==car.getg_pos()) {
					car.adddis();
					//霍晞屬縺梧ｬ｡縺ｮ繝弱�ｼ繝峨∪縺ｧ縺ｮedgeCost縺ｨ荳�閾ｴ縺励◆繧牙芦逹�蜃ｦ逅�
					int tp=nodes[car.getn_pos()].edgeTo.indexOf(nodes[car.getg_pos()]);
					if(car.getdis()==nodes[car.getn_pos()].edgeCost.get(tp)) {
						car.setn_pos(car.getg_pos());
						car.setdis(0);
					}
				}
				//騾ｲ陦梧婿蜷大渚霆｢
				else {
					int tp;
					//蜿崎ｻ｢蜃ｦ逅�
					int tmp=car.getn_pos();
					car.setn_pos(car.getg_pos());
					car.setg_pos(tmp);
					
					tp=nodes[car.getn_pos()].edgeTo.indexOf(nodes[car.getg_pos()]);
					int tmp_t=car.getdis();
					car.setdis(nodes[start].edgeCost.get(tp)-tmp_t);
					car.adddis();
					//霍晞屬縺梧ｬ｡縺ｮ繝弱�ｼ繝峨∪縺ｧ縺ｮedgeCost縺ｨ荳�閾ｴ縺励◆繧牙芦逹�蜃ｦ逅�
					tp=nodes[car.getn_pos()].edgeTo.indexOf(nodes[car.getg_pos()]);
					if(car.getdis()==nodes[car.getn_pos()].edgeCost.get(tp)) {
						car.setn_pos(car.getg_pos());
						car.setdis(0);
					}
				}
			}
		}
		//System.out.println("all:"+flgall+" ans:"+flgans);
	}
}
