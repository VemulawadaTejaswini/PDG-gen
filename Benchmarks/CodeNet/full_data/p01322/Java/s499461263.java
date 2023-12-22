import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;

			HashMap<String,Integer> map = new HashMap<String,Integer>();
			for(int i=0;i<n;i++){
				String s = sc.next().replace("*",".");
				int price = sc.nextInt();
				map.put(s,price);
			}

			int ans = 0;
			for(int i=0;i<m;i++){
				String x = sc.next();
				for(String s : map.keySet()){
					if(x.matches(s)){
						ans += map.get(s);
						break;
					}
				}
			}

			System.out.println(ans);
		}
	}
}