import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int time = sc.nextInt();
			int t_point = 0;
			int h_point = 0;
			for (int j = 0; j < time; j++) {
				// 最初は堅実にいこうと思ったけどエラーの原因がすぐに特定できないため別の方法をとることにした
//				String t_card = sc.next();
//				String h_card = sc.next();
//
//				int i;
//				for (i = 0; i < ((t_card.length()<h_card.length())?t_card.length():h_card.length()); i++) {
//					if (t_card.charAt(i) == h_card.charAt(i)) ;
//					else if (t_card.charAt(i) > h_card.charAt(i)) {
//						t_point += 3;
//						break;
//					} else {
//						h_point += 3;
//						break;
//					}
//				}
//				if (t_card.length() == i) {
//					if(t_card.length()<h_card.length()) {
//						h_point+=3;
//					}
//					else if(t_card.length()>h_card.length()) {
//						t_point+=3;
//					}
//					else {
//						t_point++;
//						h_point++;
//					}
//				}

				ArrayList<String> cards = new ArrayList<>();
				String t_card = sc.next();
				cards.add(t_card);
				cards.add(sc.next());

				Collections.sort(cards);

				if(cards.get(0).contentEquals(cards.get(1))) {
					t_point++;
					h_point++;
				}else if(cards.get(0)==t_card) {
					h_point+=3;
				}else{
					t_point+=3;
				}
			}
			System.out.println(String.format("%d %d", t_point, h_point));
		}
	}
}
