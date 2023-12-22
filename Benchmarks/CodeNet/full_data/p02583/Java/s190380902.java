import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int[] L = new int[N];
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			for(int i = 0;i<N;i++) {
				L[i] = scan.nextInt();
				if(map.containsKey(L[i])) {
					map.put(L[i], map.get(L[i])+1);
				}else {
					map.put(L[i],1);
				}
			}

			if(2>=N) {
				System.out.println(0);
				return;
			}

			ArrayList<Integer> are = new ArrayList<Integer>();


			for(Integer key:map.keySet()) {
				are.add(key);
				//System.out.println(key);
			}

			int count = 0;
			for(int i = 0;i<are.size()-2;i++) {
				for(int j = i+1;j<are.size()-1;j++) {
					for(int z = j+1;z<are.size();z++) {
						int a = are.get(i);
						int b = are.get(j);
						int c = are.get(z);

						if(Math.abs(b-c)<a&&a<b+c) {
							int co=1;
							if(map.get(a)>=2)co*=map.get(a);
							if(map.get(b)>=2)co*=map.get(b);
							if(map.get(c)>=2)co*=map.get(c);
							count+=co;
							}
					}
				}
			}


			System.out.println(count);













		}


	}


}
