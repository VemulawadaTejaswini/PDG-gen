import java.util.HashMap;
import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());	}

	public static void main(String[] $){
		int n=gInt(),k=gInt();
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<n;i++){
			int a=gInt();
			map.merge(a,1,Integer::sum);
		}
		System.out.println(
				map.values().stream()
				.sorted()
				.limit(Math.max(0,map.size()-k))
				.mapToInt(i->i)
				.sum()
				);
	}
}