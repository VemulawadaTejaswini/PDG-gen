import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());
		Boolean[] card_single = new Boolean[13];
		Arrays.fill(card_single, false);
		//S,H,D,C
		Boolean[][] card_set = {card_single.clone(), card_single.clone(), card_single.clone(), card_single.clone()};
		for(int i = 1; i <= num; i++){
			String input = br.readLine();
			String[] card = input.split(" ");
			if(card[0].equals("S")){
				card_set[0] = add_card(card_set[0], card[1]);
			}
			else if(card[0].equals("H")){
				card_set[1] = add_card(card_set[1], card[1]);
			}
			else if(card[0].equals("C")){
				card_set[2] = add_card(card_set[2], card[1]);
			}
			else if(card[0].equals("D")){
				card_set[3] = add_card(card_set[3], card[1]);
			}
		}
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				if( !card_set[i][j]){
					print_card(i, j);
				}
			}
		}
	}
	
	private static void print_card(Integer name, Integer number){
		if(name == 0){
			System.out.print("S ");
		}
		else if(name == 1){
			System.out.print("H ");
		}
		else if(name == 2){
			System.out.print("C ");
		}
		else if(name == 3){
			System.out.print("D ");
		}
		System.out.print((number + 1) + "\n");
	}
	private static Boolean[] add_card(Boolean[] set, String position){
		set[Integer.parseInt(position) - 1] = true;
		return set;
	}

}