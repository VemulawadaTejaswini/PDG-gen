import java.util.*;

class Card {
    int num;
    char color;
}

public class Main extends Card {
    static boolean solve(Card[] card) {
        if(card.length == 3) {
            if(!(card[0].color == card[1].color && card[1].color == card[2].color)) return false;
            if(card[0].num == card[1].num && card[1].num == card[2].num) return true;
            Arrays.sort(card, (a, b)-> a.num - b.num);
            if(card[0].num + 1 == card[1].num && card[1].num + 1 == card[2].num) return true;
            return false;
        } else if(card.length == 6 || card.length == 9) {
            int S = card.length;
            for(int i = 0; i < S-2; i++) {
                for(int j = i+1; j < S-1; j++) {
                    for(int k = j+1; k < S; k++) {
                        Card[] card1 = new Card[3];
                        for(int l = 0; l < 3; l++) {
                            card1[l] = new Card();
                        }
                        card1[0] = card[i];
                        card1[1] = card[j];
                        card1[2] = card[k];
                        if(solve(card1)) {
                            int count = 0;
                            Card[] card2 = new Card[S-3];
                            for(int l = 0; l < S; l++) {
                                if(l != i && l != j && l != k) {
                                    card2[count] = new Card();
                                    card2[count] = card[l];
                                    count++;
                                }
                            }
                            if(solve(card2)) return true;
                        }
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            Card[] card = new Card[9];
            for(int j = 0; j < 9; j++) {
                card[j] = new Card();
                card[j].num = sc.nextInt(); 
            }
            for(int j = 0; j < 9; j++) {
                card[j].color = sc.next().charAt(0);
            }

            if(solve(card)) System.out.println(1);
            else System.out.println(0);
        }
    }
}
