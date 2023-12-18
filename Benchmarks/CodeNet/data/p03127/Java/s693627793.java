
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static int dame_mons(ArrayList<Integer> mons,int min) {
		while(mons.size() > 1) {
			int max = mons.get(0);
			for(int i = 1; i < mons.size();i++) {
				max = Math.max(max, mons.get(i));
			}
			int max_index = mons.indexOf(max);
			mons.set(max_index, max % min);
			int zero_index = mons.indexOf(0);
			if(zero_index != -1) {
				mons.remove(zero_index);	
			}else {
				min = max % min;
			}
			
		}
		return mons.get(0); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int result;
		int min = 1000_000_000;
		ArrayList<Integer> mons = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			mons.add(sc.nextInt());
			min = Math.min(min,mons.get(i));
		}
		
		result = dame_mons(mons,min);
		System.out.println(result);
		
		sc.close();
	}

}
