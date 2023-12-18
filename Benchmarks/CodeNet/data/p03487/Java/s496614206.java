import java.util.HashMap;
import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}

	public static void main(String[]$){
		HashMap<Integer,Integer>m=new HashMap<>();
		int n=gInt();
		for(int i=0;i<n;++i)
			m.merge(gInt(),1,Integer::sum);
		System.out.println(
				m.entrySet().stream()
				.mapToInt(o->o.getValue()>=o.getKey()?o.getValue()-o.getKey():o.getValue())
				.sum()
				);
	}
}