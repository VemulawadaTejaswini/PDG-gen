import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] numArrayStr = r.readLine().split(" ");

		List<Card> cardListBubble = makeCardList(numArrayStr);
		bubbleSort(cardListBubble);
		String[] cardArrayBubble = listToArray(cardListBubble);
		printBlank(listToArray(cardListBubble));
		System.out.println("Stable");


		List<Card> cardListSlect = makeCardList(numArrayStr);
		selectSort(cardListSlect);
		String[] cardArraySlect = listToArray(cardListSlect);
		printBlank(listToArray(cardListSlect));

		if(compareAry(cardArrayBubble,cardArraySlect)){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}
	}

	public static boolean compareAry(String[] cardArrayBubble,String[] cardArraySlect){
		for(int i = 0 ; i < cardArrayBubble.length; i++){
			if(!cardArrayBubble[i].equals(cardArraySlect[i])){
				return false;
			}
		}
		return true;
	}

	public static int readInt(BufferedReader r) throws Exception{
        return Integer.parseInt(r.readLine());
    }

	public static List<Card> makeCardList(String[] numArrayStr){
		List<Card> cardList = new ArrayList<>();
		for(int i = 0; i < numArrayStr.length; i++){
			Card card = new Card(numArrayStr[i].substring(0,1),
					Integer.parseInt(numArrayStr[i].substring(1,2)));
			cardList.add(card);
		}
		return cardList;
	}

	public static String[] listToArray(List<Card> cardList){
		String[] cardArray = new String[cardList.size()];
		for(int i = 0; i < cardList.size(); i++){
			cardArray[i] = cardList.get(i).c + String.valueOf(cardList.get(i).num);
		}
		return cardArray;
	}

	public static void printBlank(String[] numArrayStr){
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < numArrayStr.length; i++){
			builder.append(numArrayStr[i]);
			builder.append(" ");
		}

		System.out.println(builder.toString().trim());
	}


	public static void bubbleSort(List<Card> cardListBubble){
		boolean flag = true;
		while(flag){
			flag = false;
			for(int i = cardListBubble.size() - 1; i > 0 ; i-- ){
				if(cardListBubble.get(i).num < cardListBubble.get(i - 1).num){
					Card tempCard = cardListBubble.get(i);
					cardListBubble.set(i,cardListBubble.get(i - 1));
					cardListBubble.set(i - 1,tempCard);
					flag = true;
				}
			}
		}
	}

	public static void selectSort(List<Card> cardListSlect){
		for(int i = 0 ; i < cardListSlect.size(); i++){
			int miny = i;
			for(int y = i; y < cardListSlect.size() ; y++){
				if(cardListSlect.get(y).num < cardListSlect.get(miny).num){
					miny = y;
				}
			}
			if(miny != i){
				Card tempCard = cardListSlect.get(i);
				cardListSlect.set(i,cardListSlect.get(miny));
				cardListSlect.set(miny,tempCard);
			}
		}
	}


}

class Card{
	Card(String c,int num){
		this.c = c;
		this.num = num;
	}
	String c;
	int num;
}