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
	
	private Scanner sc;
	
	private int numCards;
	private int[][] cards;
	
	public Main(){
		sc = new Scanner(System.in);
		numCards = MAX_CARDS;
		cards = new int[NUM_SUIT][MAX_CARD_NUMBER + 1];
	}
	
	public static void main(String[] args) {
		Main findingMissingCards = new Main();
		//ú»
		findingMissingCards.initializeCardsState();
		
		//è³É éJ[hÌnðüÍ©çó¯æé
		findingMissingCards.numCards = findingMissingCards.getNumCards();
		findingMissingCards.checkNumCards(findingMissingCards.numCards);
		
		findingMissingCards.getAllCardsExist();
		findingMissingCards.printMissingCards();
	}
	
	private void printMissingCards(){		
		//è³ÉÈ¢J[hðoÍ·é
		for(int i = 0; i < NUM_SUIT; i++){
			for(int j = 1; j < MAX_CARD_NUMBER + 1; j++){
				printMissingCard(i, j);
			}
		}
	}
	
	private void checkNumCards(int n){
		if(!(0 < n && n <= MAX_CARDS )){
			System.out.println("P`TQÜÅÌ©RðüÍµÄ­¾³¢");
			System.exit(0);
		}
	}
	
	private int getNumCards(){
		int n = 0;
		if(sc.hasNextInt()){
			n = sc.nextInt();
		}
		else{
			System.out.println("©RÈOªüÍ³êÄ¢Ü·");
			System.exit(0);
		}
		
		return n;
	}
	
	private void getCardExist(){
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
			System.out.println("S, H, C, D@¢¸ê©ðüÍµÄ­¾³¢");
			System.exit(0);
		}
	}
	
	private void getAllCardsExist(){
		//è³É éJ[hðcardzñÅ\»·é
		int i = 0;
		while(i < numCards){
			//üÍ©çè³É éJ[hðó¯æé
			getCardExist();
			i++;
		}
	}
	
	private void printMissingCard(int i, int j){
		if(cards[i][j] == EXIST){
			//J[hª¶Ý·éêÍ½àoÍµÈ¢
		}
		else{
			System.out.printf("%s %d\n", getSuit(i), j);
		}
	}
	
	private void initializeCardsState(){
		for(int i = 0; i < NUM_SUIT; i++){
			for(int j = 0; j < MAX_CARD_NUMBER; j++){
				cards[i][j] = MISSING;
			}
		}
	}
	
	private char getSuit(int n){
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