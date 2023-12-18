import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int cardList[] = new int[N];
		int result = 0;
		while(br.ready()) {
			int card = Integer.parseInt(br.readLine());
			int pear = card/2;
			result += pear;
			cardList[count] = card%2;
			if(count!=0) {
				if(cardList[count-1]>0 && cardList[count]>0) {
					if(cardList[count-1] > cardList[count]) {
						result += cardList[count];
						cardList[count] = 0;

					}else if(cardList[count-1] <= cardList[count]) {
						result += cardList[count-1];
						cardList[count] -= cardList[count-1];
					}
				}
			}
			count++;
		}
		System.out.println(result);
	}

}