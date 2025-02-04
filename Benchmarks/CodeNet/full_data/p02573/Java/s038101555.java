import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] array = new String[m];
		for(int i=0;i<m;i++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			if(a<=b) {
				array[i] = String.valueOf(a) + "," + String.valueOf(b);
			}else {
				array[i] = String.valueOf(b) + "," + String.valueOf(a);
			}
		}
		sc.close();

		Arrays.sort(array);


		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for(String str : array) {
			String a = str.split(",")[0];
			String b = str.split(",")[1];
			if(!map.containsKey(a)) {
				map.put(a,new ArrayList<String>());
				map.get(a).add(a);
				map.get(a).add(b);
			}
			if(!map.get(a).contains(b)) {
				map.get(a).add(b);
			}
		}

		int ans = 0;
		for(ArrayList<String> value : map.values()) {//[7]
			ans = Math.max(ans,value.size() );
        }
		System.out.println(ans);
	}
}
