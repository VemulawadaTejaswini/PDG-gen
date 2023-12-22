import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	
	String[] tmpArray;
	Card[] cards = new Card[n];
	for(int i = 0; i < n ; i++){
	    //空白をとる
	    tmpArray = br.readLine().split(" ");
	    //0番目にマーク1番目に番号
	    cards[i] = new Card(i, tmpArray[0], Integer.parseInt(tmpArray[1]));
	}
	
	quickSort(cards, 0, cards.length - 1);
	
	if(isStable(cards)){
	    System.out.println("Stable");
	}
	else{
	    System.out.println("Not stable");
	}
	StringBuffer sb = new StringBuffer();
	for(int i = 0; i < n; i++){
	    sb.append(cards[i].toString()+"\n");
	}
	System.out.print(sb);
    }
    
    static boolean isStable(Card[] cards){
	int currentNum = 0;
	for(int i = 1; i < cards.length; i++){
	    if(cards[i].number == currentNum && cards[i].id < cards[i - 1].id){
		return false;
	    }
	    
	    else if(cards[i].number != currentNum){
		currentNum = cards[i].number;
	    }
	}
	return true;
    }
    
    static void quickSort(Card[] cards, int p, int r){
	if(p < r){
	    int q = partition(cards, p, r);
	    quickSort(cards, p, q - 1);
 	    quickSort(cards, q + 1, r);
	}
    }
    
    // static int partition(int[] array, int p, int r){
    // 	int x = array[r];
    // 	int i = p - 1;
    // 	for(int j = p ; j <= r - 1 ;j++){
    // 	    if(array[j] <= x){
    // 		i++;
    // 		int tmp = array[i];
    // 		array[i] = array[j];
    // 		array[j] = tmp;
		
    // 	    }
    // 	}
    // 	int tmp = array[i + 1];
    // 	array[i + 1] = array[r];
    // 	array[r] = tmp;
    // 	return i + 1;
    // }
    
    static int partition(Card[] array, int p, int r){
	int x = array[r].number;
	int i = p - 1;
	for(int j = p ; j <= r -1 ;j++){
	    if(array[j].number <= x){
		i++;
		Card tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
		
	    }
	}
	Card tmp = array[i + 1];
	array[i + 1] = array[r];
	array[r] = tmp;
	return i + 1;
    }
}

class Card {
    int id;
    String mark;
    int number;
    
    public Card (int id, String mark, int number){
	this.id = id;
	this.mark = mark;
	this.number = number;
    }
    
    public String toString(){
	return mark + " "  + number;
    }
}
