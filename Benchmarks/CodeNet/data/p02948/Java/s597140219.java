
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		int day[] = new int[n];
		int money[] = new int[n];
		
		ArrayList<Integer[]> ar_shigoto = new ArrayList<>();
		for (int i = 0 ; i < n ; i ++){
			day[i] = sc.nextInt();
			money[i] = sc.nextInt();
			if (day[i] <= m) {
				Integer[] temp = {day[i], money[i]};
				ar_shigoto.add(temp);
			}	
		}
		
		
		int kane = 0;
		
		for (int nokori_nissuu = 1 ; nokori_nissuu <= m ; nokori_nissuu ++) {
			
			int best_nittou=0;
			int shouka_shigoto = 0;
			boolean get_shigoto = false;
			for (int i = 0 ; i <ar_shigoto.size() ; i++) {
				
				if (ar_shigoto.get(i)[0] <= nokori_nissuu) {
					get_shigoto = true;
					if (best_nittou < ar_shigoto.get(i)[1]) {
						best_nittou =  ar_shigoto.get(i)[1];
						shouka_shigoto  = i ;
					}
				}else {
					ar_shigoto.remove(i);
				}
			}
			
			if (get_shigoto) {
				//System.out.println("yattashigoto" + shouka_shigoto);
				ar_shigoto.remove(shouka_shigoto);
				kane += best_nittou;
			}	
		}
		System.out.println(kane);
	}
}
