

import java.util.*;

public class Main {
	static int[][][] map;
	static int n, l, min = 1000000;
	static Node[] mapscopy;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			int m = sc.nextInt();
			l = sc.nextInt();
			if(n==0&&m==0&&l==0)break;
			min=1000000;
			
			Node[] maps = new Node[n + 1];
			mapscopy = new Node[n + 1];
			for (int i = 1; i <= n; i++) {
				maps[i] = new Node(i);
				mapscopy[i] = new Node(i);
				mapscopy[i].frag=true;
			}

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int d = sc.nextInt();
				int e = sc.nextInt();

				maps[a].list.add(maps[b]);
				maps[a].length.add(d);
				maps[a].enemy.add(e);

				maps[b].list.add(maps[a]);
				maps[b].length.add(d);
				maps[b].enemy.add(e);

				mapscopy[a].list.add(maps[b]);	
				mapscopy[a].length.add(d);
				mapscopy[a].enemy.add(e);

				mapscopy[b].list.add(maps[a]);
				mapscopy[b].length.add(d);
				mapscopy[b].enemy.add(e);

			}
			ArrayList<Integer> sublist=new ArrayList<Integer>();
			sublist.add(1);
			rec(maps[1], l, 0,sublist);
			System.out.println(min);
		}

	}

	public static void rec(Node mmm, int lll, int enemy,ArrayList<Integer> lists) {
		System.out.println("my"+mmm.my+" "+lll+" "+enemy);
		if (mmm.my == n) {
//			System.out.println("result"+enemy);
			min = Math.min(min, enemy);
			lists.remove(lists.size()-1);
			return;
		}
//		System.out.println("lists"+mmm.my);
//		for(int i:lists)System.out.print(i+" ");
//		System.out.println("size "+mmm.list.size());

		
		
		for(int i=0;i<mmm.list.size();i++) {
			Node sub = mmm.list.get(i);
			int len = mmm.length.get(i);
			int ene = mmm.enemy.get(i);
			
			//mapscopy[sub.my].list.remove(0);
			//mapscopy[sub.my].length.remove(0);
			//mapscopy[sub.my].enemy.remove(0);
			
			if(lists.contains(sub.my))continue;
			//	lists.remove(lists.size()-1);
			//	return;
			
	//		int hh=enemy+ene;
	//		System.out.println(" "+lll+" "+hh);
			lists.add(sub.my);
			rec(sub, lll, enemy + ene,lists);
		
			if (lll-len>=0){
	//			int h=lll-len;
	//			System.out.println(","+h+" "+enemy);
				lists.add(sub.my);
				rec(mapscopy[sub.my], lll - len, enemy,lists);
				
			}
		}
		lists.remove(lists.size()-1);
	}
	
	public static ArrayList<Integer> cplist(ArrayList<Integer> jl){
		ArrayList<Integer> sss=new ArrayList<Integer>();
		for(int i:jl)sss.add(i);
		return sss;
	}

}

class Node {

	int my;
	boolean frag;
	int ene;
	int result;
	ArrayList<Node> list = new ArrayList<Node>();
	ArrayList<Integer> length = new ArrayList<Integer>();
	ArrayList<Integer> enemy = new ArrayList<Integer>();

	public Node(int my) {
		this.my = my;
		this.frag = false;
		this.result = 10001;
	}

}