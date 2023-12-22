import java.util.*;

public class Main {
	static Scanner In = new Scanner(System.in);
	public static void main(String[] args) {
		while(true){
			int player = In.nextInt();
			int winner = In.nextInt();
			int per = In.nextInt();
			if(player == 0 && winner == 0 && per == 0)break;
			int sum = 0;
			int[] ticket = new int[player + 1];
			for(int i = 1; i < player + 1; i++){
				ticket[i] = In.nextInt();
				sum += ticket[i];
			}
			sum = sum * (100 - per);
			if(ticket[winner] == 0)System.out.println(0);
			else System.out.println(sum / ticket[winner]);
		}
	}

}