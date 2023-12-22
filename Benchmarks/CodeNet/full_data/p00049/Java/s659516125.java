import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] b = new int[4];
		LinkedList<String> c = new LinkedList<String>();
		while(s.hasNext()){
		    String[] a = s.next().split(",");
		    c.add(a[1]);
		}
		for(int i=0 ; i<c.size() ; i++){
		    if("A".equals(c.get(i)))
			b[0]++;
		    if("B".equals(c.get(i)))
			b[1]++;
		    if("AB".equals(c.get(i)))
			b[2]++;
		    if("O".equals(c.get(i)))
			b[3]++;
		}
		for(int i=0 ; i<4 ; i++)
		    System.out.println(b[i]);
	}
}