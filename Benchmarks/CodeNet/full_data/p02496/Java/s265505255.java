import java.util.Scanner;

public class Main{
	private static final int MAX_CARDS = 52;
	private static final int NUM_SUIT = 4;
	private static final int MAX_CARD_NUMBER = 13;
	
	private static final int SPADE = 0;
	private static final int HEART = 1;
	private static final int CLUB = 2;
	private static final int DIA = 3;
	
	private static final int EXIST = 1;
	private static final int MISSING = 0;
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int numCards = MAX_CARDS;
	private static  int[][] cards = new int[NUM_SUIT][MAX_CARD_NUMBER + 1];
	
	public static void main(String[] args) {
		initializeCardsState();
		numCards = getNumCards();
		checkNumCards(numCards);
		setAllCardsExist();
		printMissingCards();
	}
	
	private static void printMissingCards(){		

		for(int i = 0; i < NUM_SUIT; i++){
			for(int j = 1; j < MAX_CARD_NUMBER + 1; j++){
				printMissingCard(i, j);
			}
		}
	}
	
	private static void checkNumCards(int n){
		if(!(0 < n && n <= MAX_CARDS )){
			System.out.println("１〜５２までの自然数を入力してください");
			System.exit(0);
		}
	}
	
	private static int getNumCards(){
		int n = 0;
		if(sc.hasNextInt()){
			n = sc.nextInt();
		}
		else{
			System.out.println("自然数以外が入力されています");
			System.exit(0);
		}
		
		return n;
	}
	
	private static void setCardExist(){
		char suit = 'a';
		int n = 0;
		
		if(sc.hasNext()){
			suit = sc.next().charAt(0);
		}
		
		if(sc.hasNextInt()){
			n = sc.nextInt();
		}
		
		switch(suit){
		case 'S':
			cards[SPADE][n] = EXIST;
			break;
		case 'H':
			cards[HEART][n] = EXIST;
			break;
		case 'C':
			cards[CLUB][n] = EXIST;
			break;
		case 'D':
			cards[DIA][n] = EXIST;
			break;
		default:
			System.out.println("S, H, C, D　いずれかを入力してください");
			System.exit(0);
		}
	}
	
	private static void setAllCardsExist(){

		int i = 0;
		while(i < numCards){

			setCardExist();
			i++;
		}
	}
	
	private static void printMissingCard(int i, int j){
		if(cards[i][j] == EXIST){

		}
		else{
			System.out.printf("%s %d\n", getSuit(i), j);
		}
	}
	
	private static void initializeCardsState(){
		for(int i = 0; i < NUM_SUIT; i++){
			for(int j = 0; j < MAX_CARD_NUMBER; j++){
				cards[i][j] = MISSING;
			}
		}
	}
	
	private static char getSuit(int n){
		switch(n){
		case SPADE:
			return 'S';
		case HEART:
			return 'H';
		case CLUB:
			return 'C';
		case DIA: 
			return 'D';
		default:
			return ' ';
		}
	}
}