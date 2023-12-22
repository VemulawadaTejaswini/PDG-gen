import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//What Color Is The Universe?
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			String a = "NO COLOR";
			boolean f = false;
			int[] c = new int[n];
			int id = 0;
			Map<Integer, Integer> m = new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++){
				int x = sc.nextInt();
				if(!m.containsKey(x)){
					m.put(x, id++);
				}
				int ref = m.get(x);
				c[ref]++;
				if(!f && c[ref]>n/2){
					f = true;
					a = x+"";
				}
			}
			System.out.println(a);
		}
	}
}