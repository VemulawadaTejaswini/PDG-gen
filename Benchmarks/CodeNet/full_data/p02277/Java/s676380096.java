import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine());
		Card[] cards = new Card[n];
		for(int i = 0 ; i < n ; i++){
			cards[i] = new Card(br.readLine(),i);
		}
		quickSort(cards,0,n - 1);

		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for(int i = 0 ; i < n ; i ++){
			if(flag){
				flag = isStable(cards,i);
			}
			sb.append(cards[i].getStr());
			sb.append("\n");
		}

		if(flag){
			sb.insert(0, "Stable" + "\n");
		}else{
			sb.insert(0, "Not stable" + "\n");
		}

		System.out.println(sb.toString());
	}

	private static void quickSort(Card[] cards,int begin,int end){

		//????????\???????????§???????????´????????????
		if(end - begin < 2){
			return;
		}

		int q = partition(cards,begin,end);

		//??????
		quickSort(cards,begin,q);
		//??????
		quickSort(cards,q + 1,end);
	}

	private static int partition(Card[] cards,int begin,int end){

		//???????????????
		int standardNum  = cards[end].getNum();
		Card tmpCard;
		//?????????????°????????????§???index
		int x = begin - 1;
		for(int i = begin ; i <  end ; i++){
			//?????????????°?????????´????????\?????????
			if(cards[i].getNum() <= standardNum){
				tmpCard = cards[i];
				cards[i] = cards[++x];
				cards[x] = tmpCard;
			}
		}

		//????????¨??????????????????????????¨????????????????????????????§??????????
		tmpCard = cards[end];
		cards[end] = cards[++x];
		cards[x] = tmpCard;
		return x;
	}

	private  static boolean isStable(Card[] cards,int i){
		if(i == 0){
			return true;
		}else if(cards[i].getNum() == cards[i - 1].getNum()
				  &&
				  cards[i].getFirstIndex() < cards[i - 1].getFirstIndex()
				  )
		{
			return false;
		}else{
			return true;
		}
	}
}

class Card{
	private String str;
	private int num;
	private int firstIndex;

	Card(String str,int firstIndex){
		this.str = str;
		this.num = Integer.parseInt(str.substring(2));
		this.firstIndex = firstIndex;
	}

	public String getStr() {
		return str;
	}
	public int getNum() {
		return num;
	}
	public int getFirstIndex() {
		return firstIndex;
	}

}