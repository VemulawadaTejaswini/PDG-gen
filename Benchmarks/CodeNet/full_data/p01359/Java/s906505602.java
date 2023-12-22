import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int n = sc.nextInt();
			int q = sc.nextInt();
			if(n == 0 && q == 0)break;
			else calc(n, q);
			
		}
	}
	public void calc(int n, int q){
		HashMap<Integer, Integer[]> year = new HashMap<Integer, Integer[]>();
		String[] eras = new String[1001];
		
		int eranum = 1;
		for(int i = 0; i < n; i++){
			String eraname = sc.next();
			int erayear = sc.nextInt();
			int wesyear = sc.nextInt();
			eras[eranum] = eraname;
			for(int j = 0; j < erayear; j++){
				year.put(wesyear - j, new Integer[]{eranum, erayear - j});
			}
			eranum++;
		}
		
		for(int i = 0; i < q; i++){
			int wesyear = sc.nextInt();
			if(!year.containsKey(wesyear)) System.out.println("Unknown");
			else System.out.println(eras[year.get(wesyear)[0]] + " " + year.get(wesyear)[1]);
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}