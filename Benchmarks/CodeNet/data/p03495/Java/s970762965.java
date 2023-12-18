import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
	int n;
	int k;
	HashMap<Integer,Integer> a;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		k = sc.nextInt();
		a = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			int num = sc.nextInt();
			if(a.containsKey(num)) {
				a.replace(num, a.get(num)+1);
			} else {
				a.put(num, 1);
			}
		}
	}
	void solve(){
		int ans = 0;
		if(a.size()>k){
			LinkedList<Integer> l = new LinkedList<Integer>(a.values());
			Collections.sort(l);
			while(l.size()>k){
				ans += l.remove();
			}
		}
		System.out.println(ans);
	}
}