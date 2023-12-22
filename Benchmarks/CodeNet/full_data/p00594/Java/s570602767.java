import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//What Color Is The Universe?
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			String a = "NO COLOR";
			Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
			for(int i=0;i<n;i++){
				int x = sc.nextInt();
				if(!m.containsKey(x)){
					m.put(x, 1);
				}
				else m.put(x, m.get(x)+1);
				if(m.get(x)>n/2 && a.equals("NO COLOR")){
					a = x+"";
				}
			}
			System.out.println(a);
		}
	}
}