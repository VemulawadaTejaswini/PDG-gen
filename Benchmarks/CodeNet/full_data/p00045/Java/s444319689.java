import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=0,u=0;
		LinkedList<Integer> b = new LinkedList<Integer>();
		LinkedList<Integer> c = new LinkedList<Integer>();
		while(s.hasNext()){
		    String[] a = s.next().split(",");
		    b.add(Integer.parseInt(a[0]));
		    c.add(Integer.parseInt(a[1]));
		}
		for(int i=0 ; i<b.size() ; i++)
		    t+=b.get(i)*c.get(i);
		for(int i=0 ; i<c.size() ; i++)
		    u+=c.get(i);
		System.out.println(t);
		System.out.println(1+Math.round(u/c.size()));
	}
}