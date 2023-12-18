import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long k = sc.nextLong();
		long[] a = new long [(int) n];

		for (long i=0; i<n; i++){
			a[(int) i] = sc.nextLong();
		}

		long pos = 1;
		long tele = 0;
		HashMap<Long,Long>map = new HashMap<Long,Long>();
		map.put(pos, tele);
		long cycle = 0;

		while (true){

			pos = a[(int) (pos-1)];
			tele +=1;

			if (tele == k){
				System.out.println(pos);
				return;
			}
			if (map.containsKey(pos)){
				cycle = tele - map.get(pos);
				break;
			} else {
				map.put(pos, tele);
			}

		}

		long mod = k % cycle;
		for (Map.Entry<Long,Long> entry : map.entrySet()){
			pos = entry.getKey();
			tele = entry.getValue();
			if (tele % cycle == mod){
				System.out.println(pos);
				return;
			}
		}

	}


}