import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			Plant[] plants = new Plant[n];
			for(int i = 0; i < n; i++){
				String name = sc.next();
				
				int[] params = new int[9];
				for(int j = 0; j < 9; j++){
					params[j] = sc.nextInt();
				}
				plants[i] = new Plant(name, params);
			}
			
			Arrays.sort(plants);
			
			for(int i = 0; i < n; i++){
				System.out.println(plants[i].name);
			}
			System.out.println("#");
		}
	}

}

class Plant implements Comparable<Plant>{
	String name;
	int[] param;
	double efficiency;
	
	Plant(String name, int[] param){
		this.name = name;
		this.param = param;
		
		calcEfficency();
	}
	
	//効率を計算
	private void calcEfficency(){
		int timeDE = param[4] + param[5];
		
		int totalTime = param[1] + param[2] + param[3] + 
				timeDE*param[8];
		
		int totalProfit = param[6]*param[7]*param[8] - param[0];
		
		this.efficiency = (double)totalProfit/totalTime;
	}

	//効率について降順に
	//効率が等しい場合は名前について辞書順
	@Override
	public int compareTo(Plant p) {
		if(this.efficiency > p.efficiency){
			return -1;
		}
		else if(this.efficiency == p.efficiency){
			return this.name.compareTo(p.name);
		}
		else {
			return 1;
		}
	}
}
