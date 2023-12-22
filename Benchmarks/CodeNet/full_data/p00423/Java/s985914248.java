import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			
			
			//System.out.println("test");
	
			int num = Integer.parseInt(br.readLine());
			//System.out.println("num = "+num);
			if(num == 0){
				
				break;
			}
			int[] cardsA = new int[num];
			int[] cardsB = new int[num];
			Player playerA = new Player();
			Player playerB = new Player();
	
			//input
			for(int i = 0; i < num ; i++){
				String[] tmpStr = br.readLine().split(" ");
				cardsA[i] = Integer.parseInt(tmpStr[0]);
				cardsB[i] = Integer.parseInt(tmpStr[1]);
			}
	
			//judge
			for(int i = 0; i < num; i++){
				if(cardsA[i] > cardsB[i]){
					playerA.addPoint(cardsA[i]+cardsB[i]);
				}
				else if(cardsA[i] < cardsB[i]){
					playerB.addPoint(cardsA[i]+cardsB[i]);
				}
				else{
					playerA.addPoint(cardsA[i]);
					playerB.addPoint(cardsB[i]);
				}
			}
	
			System.out.println(playerA.getPoint()+" "+playerB.getPoint());
		}
	}
}

class Player{
	private int point = 0;

	public void addPoint(int p){
		point += p;
	}

	public int getPoint(){
		return point;
	}
}