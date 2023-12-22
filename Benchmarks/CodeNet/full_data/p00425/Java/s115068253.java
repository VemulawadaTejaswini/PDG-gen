import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int n;
			while((n = scan.nextInt())!=0){
				Dice dice= new Dice();
				int sum = 1;
				for(int i = 0 ;i < n;i++){
					sum += dice.Change(scan.next().charAt(0));
				}
				System.out.println(sum);
			}
		}finally{
			if(scan !=null)scan.close();
		}

	}
}
class Dice{
	int[] dice;
	final int seven = 7;
	Dice(){
		dice = new int[3];
		for(int i =0;i < dice.length;i++){
			dice[i] = i+1;
		}
	}
	private void change(int i,int j){
		int tmp = dice[i];
		dice[i] = dice[j];
		dice[j] = seven - tmp;
	}
	private int North(){
		change(0,1);
		return dice[0];
	}
	private int East(){
		change(2,0);
		return dice[0];
	}
	private int West(){
		change(0,2);
		return dice[0];
	}
	private int South(){
		change(1,0);
		return dice[0];
	}
	private int Right(){
		change(1,2);
		return dice[0];
	}
	private int Left(){
		change(2,1);
		return dice[0];
	}
	public int Change(char data){
		switch(data){
		case 'N':
			return North();
		case 'E':
			return East();
		case 'W':
			return West();
		case 'S':
			return South();
		case 'R':
			return Right();
		case 'L':
			return Left();
		}
		return 0;
	}
}