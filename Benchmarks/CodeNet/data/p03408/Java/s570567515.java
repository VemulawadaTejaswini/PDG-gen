import java.util.HashMap;
import java.util.Scanner;
 
class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		m.solve(sc);
		sc.close();
	}
	void solve(Scanner sc){
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			String s = sc.next();
			if(h.containsKey(s)){
				h.replace(s, h.get(s)+1);
			} else {
				h.put(s,1);
			}
		}
		n = sc.nextInt();
		for(int i=0;i<n;i++){
			String t = sc.next();
			if(h.containsKey(t)){
				h.replace(t, h.get(t)-1);
			} else {
				h.put(t,-1);
			}
		}
		int max = 0;
		for(String s:h.keySet()){
			max = Math.max(max, h.get(s));
		}
		System.out.println(max);
	}
}