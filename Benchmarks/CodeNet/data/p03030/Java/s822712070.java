import java.util.*;

class Obj{
	String s;
	int val, idx;

	Obj(String s, int val, int idx){
		this.s = s;
		this.val = val;
		this.idx = idx;
	}

	public String toString(){
		return "" + this.idx;
	}
}
public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s;
		int val;
		ArrayList<Obj> list = new ArrayList<>();
		for(int i = 0; i < n; i++){
			s = in.next();
			val = in.nextInt();
			list.add(new Obj(s, val, i+1));
		}

		Collections.sort(list, new Comparator<Obj>() {
			@Override
			public int compare(Obj o1, Obj o2){
				if( o1.s.equals(o2.s) ){
					return o2.val - o1.val;
				}else{
					return o1.s.compareTo(o2.s);
				}
			}
		});
		for(int i = 0; i < n; i++)
			System.out.println(list.get(i));
	}
}