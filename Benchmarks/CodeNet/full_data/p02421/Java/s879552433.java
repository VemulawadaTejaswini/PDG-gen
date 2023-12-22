

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tarou_point = 0,hanako_point = 0;

		Scanner in = new Scanner(System.in);

		int game_num =in.nextInt();

		for(int i = 0; i < game_num; i++){

			String tarou_card = in.next();
			String hanako_card = in.next();
			int length = 0;
			int tarou_length = tarou_card.length();
			int hanako_length = hanako_card.length();
			char a = 'a';

			if(tarou_length > hanako_length){

				length = hanako_length;

			}else if(tarou_length <= hanako_length){

				length = tarou_length;

			}

			//for(int i = 0; i < length; i++){

				System.out.println(tarou_card.compareToIgnoreCase(hanako_card));

				if(tarou_card.compareToIgnoreCase(hanako_card) == 0){

					tarou_point += 1;
					hanako_point += 1;

				}else if(tarou_card.compareToIgnoreCase(hanako_card) > 0){

					tarou_point += 3;

				}else if(tarou_card.compareToIgnoreCase(hanako_card) < 0){

					hanako_point += 3;

				}



			/*}


			if(tarou_card.equals(hanako_card)){

				tarou_point += 1;
				hanako_point += 1;
				continue;

			}else{

				while(true){

					int j = 0;

					for(a = 'a'; a <= 'z'; a++){

						if((tarou_card.charAt(j) == a && hanako_card.charAt(j) == a)){

							j++;
							a = 'a';
							continue;

						}else{




						if(tarou_card.charAt(j) == a){

						hanako_point += 3;

						break;

					}else if(hanako_card.charAt(j) == a){

						tarou_point += 3;

						break;

					}


					}




					}
					break;
				}


			}*/

		}

		System.out.println(tarou_point + " " + hanako_point);

	}

}