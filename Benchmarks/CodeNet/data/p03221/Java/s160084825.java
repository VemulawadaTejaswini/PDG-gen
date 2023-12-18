import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer>map = new LinkedHashMap<>();
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int p=sc.nextInt();
			int y=sc.nextInt();
			map.put(y, p);
		}
		for (int key : map.keySet()) {
		      System.out.println( map.get(key)+" "+key );
		    }
	}
}