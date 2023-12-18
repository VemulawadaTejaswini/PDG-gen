
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		Map<Integer, Character> map = new HashMap();
		char[] work = new char[s.length()];

		for(int i = 0; i < s.length(); i++){
            work[i] = s.charAt(i);
         }

		for (int i = 0; i < s.length(); i++){
			map.put(i+1, work[i]);
		}

		long sum = 0;

		for (Entry<Integer, Character> entry1 : map.entrySet()) {
			for (Entry<Integer, Character> entry2 : map.entrySet()) {
				for (Entry<Integer, Character> entry3 : map.entrySet()) {

					int k1 = entry1.getKey();
					int k2 = entry2.getKey();
					int k3 = entry3.getKey();

					if (k1 > k2 || k2 > k3 ){
						continue;
					}

					if (k2 - k1 == k3 - k2){
						continue;
					}

					Character v1 = entry1.getValue();
					Character v2 = entry2.getValue();
					Character v3 = entry3.getValue();

					if ( v1.equals( v2 ) ){
		            	continue;
		            } else if( v1.equals( v3 ) ){
		            	continue;
		            } else if( v2.equals( v3 ) ){
		            	continue;
		            }

					sum++;
		        }
	        }
        }
		System.out.println(sum);

	}

}

