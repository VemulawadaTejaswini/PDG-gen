import java.util.*;
import java.awt.geom.*;
public class Main {

	//2332 start
	//2339 TLE
	//2351 TLE
	//2359 RE
	//0003 WA
	//0005 TLE
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if((n|m|k) == 0) break;
			LinkedList<Integer> stones = new LinkedList<Integer>();
			for(int i = 0; i < n; i++){
				stones.add(i + 1);
			}
			int removeind = m-1;
			stones.remove(removeind);
			int step = k - 1;
			int restnum = n-1;
			if(stones.size() == 1){
				System.out.println(stones.get(0));
				continue;
			}
			int i = removeind + 1;
			while(true){
				step--;
				if(step == 0){
					removeind = i;
					restnum--;
					stones.remove(removeind);
					if(restnum == 1){
						System.out.println(stones.get(0));
						break;
					}
					step = k - 1;
					i = removeind;
				}
				i++;
				if(i >= stones.size()){
					i = i % stones.size();
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}