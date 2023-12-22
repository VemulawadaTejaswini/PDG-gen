import java.util.Scanner;


public class Main {

	Main(){
		doIt();
	}
	
	void doIt(){
		Scanner sc = new Scanner(System.in);
		int[] weight = {2, 3, 5, 10, 12, 15};
		int[] price = {380, 550, 850, 1520, 1870, 2244};
		while(true){
			int goal = sc.nextInt();
			goal /= 100;
			
			int[] aw = new int[goal + 1];
			
			if(goal == 0) break;
			for(int i = 0; i <= goal; i++){
				for(int k = 0; k < 6; k++){
					if(goal < i + weight[k])break;
					if(i == 1) break;
					if(aw[i+weight[k]] == 0 || aw[i] + price[k] < aw[i+weight[k]]) {
						aw[i+weight[k]] = aw[i] + price[k];
					}
				}
			}
			System.out.println(aw[goal]);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}