
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp  = scanner.nextLine().split(" ");
		int k    	  = Integer.parseInt(tmp[1]);
		Map<Integer, Integer> Nmap = new HashMap<Integer,Integer>();
		Map<Integer, Integer> Cmap = new HashMap<Integer,Integer>();


		for(int i = 0; i < k ; i++) {

			String[] tmp1 = scanner.nextLine().split(" ");
			int a   	  = Integer.parseInt(tmp1[0]);
            String b      = tmp1[1];

			if(b.equals("WA")) {
				if(!Cmap.containsKey(a)) {

					if(Nmap.containsKey(a)) {
						System.out.println(a + b);

						Nmap.put(a, Nmap.get(a)+ 1);

					}else {

						Nmap.put(a, 1);

					}
				}
			}else{
				if(!Cmap.containsKey(a)) {
					Cmap.put(a, 1);
				}
			}
		}

		int good = 0;
		int bad  = 0;

		for (Entry<Integer,Integer> entry : Nmap.entrySet()){
	    	bad += entry.getValue();
	    }
		for (Entry<Integer,Integer> entry : Cmap.entrySet()){
	    	good += entry.getValue();
	    }

		System.out.println(good + " " + bad);
	}
}