import java.util.*;
import java.awt.geom.*;
public class Main {
	//1100 cording
	
	int [] vx = {0,  1,1,0,-1,-1};
	int [] vy = {-1,-1,0,1, 1, 0};
	
	class P{
		int x,y;

		public P(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		int dataset = Integer.parseInt(sc.nextLine());
		while(dataset-- > 0){
			ArrayList<Integer> a = init(sc.nextLine());
			ArrayList<Integer> b = init(sc.nextLine());
			sc.nextLine();
			
			if(a.size() != b.size()){
				System.out.println(false);
				continue;
			}
			HashSet<P> recordA = step(a);
			boolean flg = false;
			for(int i = 0 ; i < 6; i++){
				//System.out.println(b);
				for(int j = 0 ; j < b.size(); j++){
					int now = (b.get(j) + 1) % 6;
					b.set(j, now);
				}
				//System.out.println(b);
				//System.out.println("--");
				
				HashSet<P> recordB = step(b);
				
				boolean res = compare(recordA, recordB);
				if(res){
					flg = true;
					break;
				}
				
				Collections.reverse(b);
				recordB = step(b);
				res = compare(recordA, recordB);
				if(res){
					flg = true;
					break;
				}
				Collections.reverse(b);
			}
			System.out.println(flg);
		}
	}

	private boolean compare(HashSet<P> a, HashSet<P> b) {
		for(P va : a){
			boolean flg = false;
			for(P vb: b){
				if(va.x == vb.x && va.y == vb.y){
					flg = true;
					break;
				}
			}
			if(! flg) return false;
		}
		return true;
	}

	private HashSet<P> step(ArrayList<Integer> a) {
		int len = a.size();
		int x = 0, y = 0;
		HashSet<P> res = new HashSet<P>();
		for(int i = 0 ; i < len; i++){
			
			x = x + vx[a.get(i)];
			y = y + vy[a.get(i)];
			res.add(new P(x, y));
			//System.out.println(x + ", " + y);
		}
		//System.out.println("---");
		return res;
	}

	private ArrayList<Integer> init(String next) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int len = next.length();
		for(int i = 0 ; i < len; i++){
			int now = next.charAt(i) - 'a';
			res.add(now);
		}
		return res;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}