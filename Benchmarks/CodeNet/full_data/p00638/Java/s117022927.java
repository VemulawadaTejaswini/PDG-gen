import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a: while(true){
			int N = sc.nextInt();
			if(N==0)break;
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for(int i=0;i<N;i++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				map.put(b, a);
			}
			int c=0;
			for (Entry<Integer, Integer> m : map.entrySet()) {
				c+=m.getValue();
				if(c>m.getKey()){
					System.out.println("No");
					continue a;
				}
			}
			System.out.println("Yes");
		}
	}
}