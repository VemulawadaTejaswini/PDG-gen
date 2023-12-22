import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] a = new int [n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		int pos = 1;
		int tele = 0;
		HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
		map.put(pos, tele);
		int cycle = 0;

		while (true){

			pos = a[pos-1];
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
		for (Map.Entry<Integer,Integer> entry : map.entrySet()){
			pos = entry.getKey();
			tele = entry.getValue();
			if (tele % cycle == mod){
				System.out.println(pos);
				return;
			}
		}

	}


}