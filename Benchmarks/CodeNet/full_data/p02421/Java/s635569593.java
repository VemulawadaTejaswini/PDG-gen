import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		int card_sum = scan.nextInt();
//		int card_sum = Integer.parseInt(args[0]);
		int judge,taro_score = 0,hanako_score = 0;
	for(int i = 0;i < card_sum;i++){

		String taro_card = scan.next();
		String hanako_card = scan.next();
//		String taro_card = args[k];
//		String hanako_card = args[k + 1];


		judge = taro_card.compareTo(hanako_card);
		if(judge > 0){
			taro_score += 3;
		}else if(judge < 0){
			hanako_score += 3;
		}else{
			taro_score += 1;
			hanako_score += 1;
		}

	}
	System.out.println(taro_score + " " + hanako_score);
	}


}
