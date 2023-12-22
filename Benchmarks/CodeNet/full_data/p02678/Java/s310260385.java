

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int start,end;
		ArrayList<Node> nodes=new ArrayList<Node>();
		nodes.add(new Node(0));
		nodes.add(new Node(1));
		nodes.get(1).length=0;
		for(int i=2;i<=n;i++) {
			nodes.add(new Node(i));
		}
		for(int i=0;i<m;i++) {
			start=scanner.nextInt();
			end=scanner.nextInt();
			nodes.get(start).next.add(end);
			nodes.get(end).next.add(start);
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<nodes.get(i).next.size();j++) {
				if(nodes.get(nodes.get(i).next.get(j)).length>nodes.get(i).length) {
					nodes.get(nodes.get(i).next.get(j)).length=nodes.get(i).length+1;
					nodes.get(nodes.get(i).next.get(j)).pre=i;
					
				}
				else if(nodes.get(nodes.get(i).next.get(j)).length<nodes.get(i).length) {
					nodes.get(i).length=nodes.get(nodes.get(i).next.get(j)).length+1;
					nodes.get(i).pre=nodes.get(nodes.get(i).next.get(j)).num;
				}
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=0;j<nodes.get(i).next.size();j++) {
				if(nodes.get(nodes.get(i).next.get(j)).length>nodes.get(i).length) {
					nodes.get(nodes.get(i).next.get(j)).length=nodes.get(i).length+1;
					nodes.get(nodes.get(i).next.get(j)).pre=i;
					
				}
				else if(nodes.get(nodes.get(i).next.get(j)).length<nodes.get(i).length) {
					nodes.get(i).length=nodes.get(nodes.get(i).next.get(j)).length+1;
					nodes.get(i).pre=nodes.get(nodes.get(i).next.get(j)).num;
				}
			}
		}
		for(int i=1;i<=n;i++) {
			if(nodes.get(i).length==10000000) {
				System.out.println("No");
				return;
			}
			
		}
		System.out.println("Yes");
		for(int i=2;i<=n;i++) {
			System.out.println(nodes.get(i).pre);
		}
	}
	
}
class Node implements Comparable<Node>{
	int num;
	int pre=-1;
	int length=10000000;
	ArrayList<Integer> next=new ArrayList<Integer>();
	public Node(int num) {
		this.num=num;
	}
	@Override
	public int compareTo(Node o) {
		
		return this.length-o.length;
	}
	
}