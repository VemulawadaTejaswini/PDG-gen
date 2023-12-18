
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	static class Node{
		private ArrayList<Integer>next_list;

		public Node(){
			next_list = new ArrayList<>();
		}

		public void addNext(int next){
			next_list.add(next);
		}

		public int getNextCount(){
			return next_list.size();
		}

		public int getNextId(int id){
			return next_list.get(id);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int node_count = sc.nextInt();
		int pass_count = sc.nextInt();

		Node[] node_list = new Node[node_count];

		for(int i = 0;i < node_list.length;i++){
			node_list[i] = new Node();
		}

		for(int i = 0;i < pass_count;i++){
			int j = sc.nextInt() - 1;
			int k = sc.nextInt() - 1;
			node_list[j].addNext(k);
			node_list[k].addNext(j);
		}

		ArrayList<Integer>pass_list = new ArrayList<Integer>();
		pass_list.add(0);

		boolean front_completed = false;

		while(true){
			int i = 0;
			if(!front_completed){
				Node front_node = node_list[pass_list.get(0)];
				for(i = 0;i < front_node.getNextCount();i++){
					int j = front_node.getNextId(i);
					if(!pass_list.contains(j)){
						pass_list.add(0, j);
						break;
					}
				}
				if(i != front_node.getNextCount())continue;
			}
			front_completed = true;

			Node back_node = node_list[pass_list.get(pass_list.size() - 1)];
			for(i = 0;i < back_node.getNextCount();i++){
				int j = back_node.getNextId(i);
				if(!pass_list.contains(j)){
					pass_list.add(j);
					break;
				}
			}
			if(i == back_node.getNextCount())break;
		}
		System.out.println(pass_list.size());
		for(int i = 0;i < pass_list.size();i++){
			System.out.print(pass_list.get(i) + 1);
			if(i != pass_list.size() - 1)System.out.print(" ");
		}
		System.out.println();


		sc.close();
	}
}
