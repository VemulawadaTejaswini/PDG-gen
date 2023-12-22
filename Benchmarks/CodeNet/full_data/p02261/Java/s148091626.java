	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(System.getProperty("line.separator"));
        int n = sc.nextInt();
        String data = sc.next();

        //String???Int????????????
        String[] datas = data.split(" ");

        Card[] cardsBubble = bubbleSort(getCards(datas,n),n);
        System.out.println("Stable");
        Card[] cardsSelect = selectionSort(getCards(datas,n),n);
        isStable(cardsBubble, cardsSelect, n);
	}



	private static void isStable(Card[] cardsBubble, Card[] cardsSelect, int n) {
		boolean stable=true;
		for(int i=0; i<n; i++){
			if(!cardsBubble[i].suit.equals(cardsSelect[i].suit)){
				stable = false;
				break;
			}
		}
		if(stable){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}
	}



	private static Card[] getCards(String[] datas, int n) {
		Card[] cards = new Card[n];
		for(int i=0; i<datas.length; i++){
			cards[i] = new Card(datas[i].substring(0, 1), Integer.parseInt(datas[i].substring(1, 2)));
		}
		return cards;
	}

	static class Card{
		public String suit;
		public int value;
		public Card(String suit, int value){
			this.suit = suit;
			this.value = value;
		}
		public Card(){
		}
	}


	private static Card[] bubbleSort(Card[] cards, int n) {
		boolean flag = true;
		for(int i=0; flag==true; i++){
			flag = false;
			//bubble sort
			for(int j=0; j<n-1; j++){
				if(cards[j].value > cards[j+1].value){
					Card tmp = new Card(cards[j].suit, cards[j].value);
					cards[j] = cards[j+1];
					cards[j+1] = tmp;
					flag = true;
				}
			}
		}
		disp(cards,n);
		return cards;
	}


	private static Card[] selectionSort(Card[] cards, int n) {
		for(int i=0; i<n; i++){
			int minj= i;
			for(int j=i; j<n; j++){
				if(cards[j].value < cards[minj].value) minj = j;
			}
			//???????????????????§??????????????´???¨????°?????´????????????????
			Card tmp = new Card(cards[i].suit, cards[i].value);
			cards[i] = cards[minj];
			cards[minj] = tmp;
		}
		disp(cards,n);
		return cards;
	}



	private static void disp(Card[] cards, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(cards[i].suit + cards[i].value);
			if(i!=n-1)System.out.print(" ");
		}
		System.out.println();
	}