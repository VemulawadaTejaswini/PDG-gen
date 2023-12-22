import java.util.*;

public class Main{
	//1200 start
	int size, n, ans;
	String [] data;
	HashSet<Character> kind;
	HashMap<Character, Integer> change, leftmap;
	boolean [] used;
	ArrayList<Character> data2;
	HashSet<Character> nonzero;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			leftmap = new HashMap<Character, Integer>();
			kind = new HashSet<Character>();
			nonzero = new HashSet<Character>();
			data = new String[n];
			for(int i = 0; i < n; i++){
				data[i] = sc.next();
				int nowlen = data[i].length();
				for(int j = 0; j < nowlen; j++){
					char c = data[i].charAt(j);
					kind .add(c);
					if(j == 0 && nowlen > 1){
						nonzero.add(c);
					}
					int value =  pow((nowlen - 1 - j));
					//System.out.println("value = " + c + " " + value );
					
					if(i != n-1){
						if(leftmap.containsKey(c)){
							leftmap.put(c, leftmap.get(c) + value);
						}
						else{
							leftmap.put(c, value);
						}
					}
					else{
						if(leftmap.containsKey(c)){
							leftmap.put(c, leftmap.get(c) - value);
						}
						else{
							leftmap.put(c, -value);
						}
					}
					
				}
			}
			
			change = new HashMap<Character, Integer>();
			size = kind.size();
			data2 = new ArrayList<Character>();
			for(char c: nonzero){
				data2.add(c);
			}
			for(char c: kind){
				if(nonzero.contains(c)) continue;
				data2.add(c);
			}
			ans = 0;
			used = new boolean[10];
			dfs(0,0);
			System.out.println(ans);
		}
	}
	
	private int pow(int x) {
		int sum = 1;
		for(int i = 0; i < x; i++){
			sum *= 10;
		}
		return sum;
	}

	private void dfs(int deep, int left) {
		if(deep == size){
			if(left ==0){
				//System.out.println(left + " " + right);
				ans++;
			}
			return;
		}
		char now = data2.get(deep);
		
		for(int i = 0; i < 10; i++){
			if(used[i])continue;
			if(i == 0 && nonzero.contains(now)){
				continue;
			}
			used[i] = true;
			int addleft = 0;
			if(leftmap.containsKey(now)){
				addleft = leftmap.get(now) * i;
			}
			
			dfs(deep+1, left + addleft);
			used[i] = false;
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}