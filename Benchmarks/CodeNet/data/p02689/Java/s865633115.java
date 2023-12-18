import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int res = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int h[] = new int[n];
        for(int i=0;i<n;i++) {
        	h[i] = sc.nextInt();
        }
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>> ();
        for(int i=0;i<m;i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	if(!map.containsKey(a)) {
        		List<Integer> l = new ArrayList<Integer>();
        		l.add(b);
        		map.put(a, l);
        	}
        	else {
        		List<Integer> l = map.get(a);
        		l.add(b);
        		map.put(a,l);
        	}
        	if(!map.containsKey(b)) {
        		List<Integer> l = new ArrayList<Integer>();
        		l.add(a);
        		map.put(b, l);
        	}
        	else {
        		List<Integer> l = map.get(b);
        		l.add(a);
        		map.put(b,l);
        	}
        }
        for(int a : map.keySet()) {
        	boolean flag = false;
        	for(int i=0;i<map.get(a).size();i++) {
        		if(h[a-1]>h[map.get(a).get(i)-1]) {
        			flag =true;
        		}
        		else {
        			flag=false;
        			break;
        		}
        	}
        	if(flag==true) {
        		res++;
        	}
        }
        System.out.println(res+(n-map.size()));
	}
}
