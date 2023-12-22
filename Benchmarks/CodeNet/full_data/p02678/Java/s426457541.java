/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
		int p = s.nextInt();
// 		DSU dsu = new DSU(n);
		for(int i=0;i<p;i++){
			int a = s.nextInt();
			int b = s.nextInt();
			if(!map.containsKey(a-1)){
				map.put(a-1,new ArrayList<>());
			}
			if(!map.containsKey(b-1)){
				map.put(b-1,new ArrayList<>());
			}
			map.get(a-1).add(b-1);
			map.get(b-1).add(a-1);
// 			dsu.union(a-1,b-1);
		}
		HashMap<Integer,Integer> c = new HashMap<>();
		Queue<Integer> q = new LinkedList<>();
		q.offer(0);
// 		int count =1;
		while(!q.isEmpty()){
		    int size = q.size();
		    for(int i=0;i<size;i++){
		        int cur = q.poll();
		        for(int next : map.get(cur)){
		            if(c.containsKey(next)){
		                continue;
		            }
		            else{
		                c.put(next,cur);
		                q.offer(next);
		            }
		        }
		    }
		  //  count++;
		}
		if(c.size()<n){
		    System.out.println("No");
		}
		else{
		    System.out.println("Yes");
		    for(int i=1;i<n;i++){
		        System.out.println(c.get(i)+1);
		    }
		}
	}
}