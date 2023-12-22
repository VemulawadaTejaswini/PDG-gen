import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] n;
		RPS rps;
		
		out : while(true){
			n = new int[5];
			for(int i=0;i<5;i++){
				n[i] = scan.nextInt();
				if(n[i] == 0){
					break out;
				}
			}
			
			rps = new RPS(n);
			rps.game();
			for(int i=0;i<5;i++){
				System.out.println(rps.getResult(i));
			}
		}
	}
}

class RPS{
	int[] hand,result;
	boolean rock,paper,scissors;
	
	RPS(int[] hand){
		this.hand = hand;
		result = new int[5];
		rock = false;
		scissors = false;
		paper = false;
	}
	
	public void game(){
		for(int i=0;i<hand.length;i++){
			if(hand[i] == 1){
				rock = true;
			}else if(hand[i] == 2){
				scissors = true;
			}else{
				paper = true;
			}
		}
		
		for(int i=0;i<hand.length;i++){
			if(rock && scissors && paper){
				result[i] = 3;
			}else if(rock && scissors){
				if(hand[i] == 1){
					result[i] = 1;
				}else{
					result[i] = 2;
				}
			}else if(scissors && paper){
				if(hand[i] == 2){
					result[i] = 1;
				}else{
					result[i] = 2;
				}
			}else if(paper && rock){
				if(hand[i] == 3){
					result[i] = 1;
				}else{
					result[i] = 2;
				}
				
			}else{
				result[i] = 3;
			}
		}
	}
	
	public int getResult(int index){
		return result[index];
	}
}