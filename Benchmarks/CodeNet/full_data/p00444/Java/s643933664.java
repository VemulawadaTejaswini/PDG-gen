import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true){
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			System.out.println(new Change(n).getCoin());
		}
	}
}

class Change{
	int coin;
	
	Change(int n){
		coin = 0;
		countCoin(n);
	}
	
	private void countCoin(int n){
		int change = 1000-n;
		
		if(change >= 500){
			change -=500;
			coin ++;
		}
		
		while(change >= 100){
			change -=100;
			coin ++;
		}
		
		while(change >= 50){
			change -=50;
			coin ++;
		}
		
		while(change >= 10){
			change -=10;
			coin ++;
		}
		
		while(change >= 5){
			change -=5;
			coin ++;
		}
		
		while(change >= 1){
			change -=1;
			coin ++;
		}
	}
	
	public int getCoin(){
		return coin;
	}
}