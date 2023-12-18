import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list_ac=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		String s = sc.next();
		String t = sc.next();
		Map<String, String> mMap = new HashMap<String, String>();
		Map<String, String> mMap_2 = new HashMap<String, String>();
		List<String> list_s=new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> list_t=new ArrayList<String>(Arrays.asList(t.split("")));
		for(int i=0;list_s.size()>i;i++) {
			for(int j=0;mMap.size()>j;j++) {
				if(mMap.containsKey(list_t.get(j))) {
					if(!list_s.get(j).equals(mMap.get(list_t.get(j)))) {
						System.out.println("No");
						System.exit(0);
					}
				}

				if(mMap_2.containsKey(list_s.get(j))) {
					if(!list_t.get(j).equals(mMap_2.get(list_s.get(j)))) {
						System.out.println("No");
						System.exit(0);
					}
				}

			}
			mMap.put(list_t.get(i), list_s.get(i));
			mMap_2.put(list_s.get(i), list_t.get(i));
		}
		System.out.println("Yes");

	}
}