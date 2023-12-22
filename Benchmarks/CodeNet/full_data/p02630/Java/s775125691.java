import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		long sum=0;
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			map.put(a,map.getOrDefault(a,0)+1);
			sum=sum+a;
		}
		int q = sc.nextInt();
		for(int i=0;i<q;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d =0;
			if(map.get(a)!=null){
				d=map.get(a);
			}
			int e=0;
			if(map.get(b)!=null){
				e=map.get(b);
			}
			int r = (b-a);
			long f = r*d;
			sum=sum+f;
			map.remove(a);
			if(d!=0)map.put(b,d+e);
			//printMap(map);
			System.out.println(sum);
		}
		
	}
	private static void printMap(Map < Integer, Integer > map) {
        for (Integer s: map.keySet()) {
            System.out.println(s);
        }
    }
}