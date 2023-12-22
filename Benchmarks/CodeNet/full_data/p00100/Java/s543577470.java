import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{


	public static void main(String[] a){


		Scanner sc = new Scanner(System.in);



		while(sc.hasNext()) {

			int n = sc.nextInt();

			if(n == 0){break;}


			int syainNo;
			int tanka;
			int suryo;
			int goukei;
			Map<Integer, Integer> map = new HashMap<>();

			for(int i = 0; i < n; i++) {
				syainNo = sc.nextInt();
				tanka = sc.nextInt();
				suryo = sc.nextInt();
				goukei = tanka * suryo;

				if(map.get(syainNo) == null) {
					map.put(syainNo, goukei);
				}else{
					map.put(syainNo, map.get(syainNo) + goukei);
				}

			}

			Object[] mapkey = map.keySet().toArray();
			Arrays.sort(mapkey);

			int count = 0;
			for(int no: map.keySet()) {
				int data = map.get(no);

				if(data >= 1000000) {
					System.out.println(no);
					count++;
				}

			}
			if(count == 0) {System.out.println("NA");}


		}


	}
}