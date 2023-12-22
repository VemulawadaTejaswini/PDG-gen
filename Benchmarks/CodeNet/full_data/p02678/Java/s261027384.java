import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		List[] list = new ArrayList[n+1]; //0は使わない
		for(int i = 0 ; i < n ; i++) {
			list[i+1] = new ArrayList();
		}
		
		boolean[] follow = new boolean[n+1];
		follow[1] = true;
		int[] guid = new int[n+1];
		
		for(int i = 0 ; i < m ; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			list[a].add(new root(a,b));
			list[b].add(new root(b,a));
		}
		
        Deque<List> queue = new ArrayDeque<>();
        queue.add(list[1]);
        
        int pos = 1;
        while(!queue.isEmpty()){
        	List<root> tmplist = queue.poll();
        	for(root tmp : tmplist) {
        		if(!follow[tmp.next]) {
        			follow[tmp.next] = true;
        			guid[tmp.next] = tmp.pos;
        			queue.add(list[tmp.next]);
        		}
        	}
        }
		
        System.out.println("yes");
        for(int i = 2 ; i < n+1 ; i++) {
    		System.out.println(guid[i]);
        }
		
	}
}


class root{
	public int pos;
	public int next;
	
	public root(int pos , int next) {
		this.pos = pos;
		this.next = next;
	}
	
	
}
