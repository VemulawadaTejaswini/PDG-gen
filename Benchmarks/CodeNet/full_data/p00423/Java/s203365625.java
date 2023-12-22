import java.io.BufferedReader;
import java.io.InputStreamReader;

class CardGame{

	public static void main(String args[]){
		try{
			String result = new String();
			while(true){
				// まずカードの枚数を入力
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int cardnum = Integer.parseInt(br.readLine());
				if(cardnum == 0) break; // 0が入力されたら終了
				//System.out.println(cardnum);
				int scoreA = 0, scoreB = 0;
				for(int i = 0; i < cardnum; i++){
					// スペースで文字を区切る
					String read_str = br.readLine();
					String[] cards_str = read_str.split(" ");
					//System.out.println(cards_str[0]);
					//System.out.println(cards_str[1]);
					int cardA = Integer.parseInt(cards_str[0]);
					int cardB = Integer.parseInt(cards_str[1]);
					if(cardA > cardB){
						scoreA += (cardA + cardB);
					}else if(cardA < cardB){
						scoreB += (cardA + cardB);
					}else{
						scoreA += cardA;
						scoreB += cardB;
					}
				}
				result += (scoreA + " " + scoreB + "\n");
			}
			System.out.println(result);
		}catch(Exception e){
			System.err.println(e);
		}
	}
}