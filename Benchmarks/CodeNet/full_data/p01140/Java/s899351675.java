import java.util.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n |m) == 0) break;
			int [] hlist = new int[n];
			for(int i = 0; i < n; i++){
				hlist[i] = sc.nextInt();
			}
			int [] wlist = new int[m];
			for(int i= 0; i < m ;i++){
				wlist[i] = sc.nextInt();
			}
			HashMap<Integer, Integer> x = new HashMap<Integer, Integer>();
			HashMap<Integer, Integer> y = new HashMap<Integer, Integer>();
			int sum = 0;
			for(int i = 0; i < n; i++){
				sum += hlist[i];
				int v = sum;
				for(int j = 0; j <= i; j++){
					if(x.containsKey(v)){
						x.put(v, x.get(v) + 1);
					}
					else{
						x.put(v, 1);
					}
					v = v - hlist[j];
				}
			}
			
			sum = 0;
			for(int i = 0; i < m; i++){
				sum += wlist[i];
				int v = sum;
				for(int j = 0; j <= i; j++){
					if(y.containsKey(v)){
						y.put(v, y.get(v) + 1);
					}
					else{
						y.put(v, 1);
					}
					v = v - wlist[j];
				}
			}
			
			int ans = 0;
			for(int xx: x.keySet()){
				if(y.containsKey(xx)){
					ans += x.get(xx) * y.get(xx);
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}