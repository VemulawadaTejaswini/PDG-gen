import java.util.*;

public class Main {
	//0327 start
	
	class E{
		int from, to;

		public E(int from, int to) {
			this.from = from;
			this.to = to;
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			ArrayList<ArrayList<E>> pass = new ArrayList<ArrayList<E>>();
			for(int i = 0 ; i <= 100; i++){
				pass.add(new ArrayList<Main.E>());
			}
			
			while(true){
				int a = sc.nextInt(), b = sc.nextInt();
				if((a|b) == 0) break;
				pass.get(a).add(new E(a, b));
				pass.get(b).add(new E(b, a));
			}
			
			boolean res = isEuler(pass, 1, 2);
			System.out.println(res ? "OK" : "NG");
		}
	}
	private boolean isEuler(ArrayList<ArrayList<E>> pass,int start, int goal) {
		for(int i = 0; i < pass.size(); i++){
			if(i == start || i == goal) continue;
			if(pass.get(i).size() % 2 != 0){
				return false;
			}
		}
		if(pass.get(start).size() % 2 == pass.get(goal).size() % 2 && pass.get(start).size() % 2 == 1){
			return true;
		}
		return false;
	}
	public static void main(String [] args){
		new Main().doit();
	}
}