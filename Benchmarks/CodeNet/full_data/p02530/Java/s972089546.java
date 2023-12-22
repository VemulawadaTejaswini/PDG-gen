import java.util.Scanner;


public class Main {
	private static final int WINNER_TAROU = 1;
	private static final int WINNER_HANAKO = 0;
	private static final int DRAW = -1;
	
	private static int pointTarou = 0;
	private static int pointHanako = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i = 0; i < num; i++){
			addPoint(sc.next(), sc.next());
		}
		
		System.out.println(pointTarou + " " + pointHanako);
	}
	
	private static int getWinner(String cardTarou, String cardHanako){
		int result = cardTarou.compareTo(cardHanako);
		if(result < 0){
			return WINNER_HANAKO;
		}
		else if(result == 0){
			return DRAW;
		}
		else{
			return WINNER_TAROU;
		}
	}
	
	public static void addPoint(String cardTarou, String cardHanako){
		switch(getWinner(cardTarou, cardHanako)){
		case WINNER_HANAKO:
			pointHanako = pointHanako + 3;
			break;
		case WINNER_TAROU:
			pointTarou = pointTarou + 3;
			break;
		case DRAW:
			pointHanako++;
			pointTarou++;
		}
	}
}