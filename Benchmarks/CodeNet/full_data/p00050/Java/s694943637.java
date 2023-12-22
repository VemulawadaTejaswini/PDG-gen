import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList<String> a = new LinkedList<String>();
		while(s.hasNext()){
		    a.add(s.next());
		}
		for(int i=0 ; i<a.size() ; i++){
		    if("apple".equals(a.get(i)))
			a.set(i,"peach");
		    if("peach".equals(a.get(i)))
			a.set(i,"apple");
		}
		for(int i=0 ; i<a.size()-1 ; i++)
		    System.out.print(a.get(i) + " ");
		System.out.print(a.get(a.size()-1));
	}
}