import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedHashMap;

class Deck{
    private LinkedHashMap<Integer, Integer> frequency = new LinkedHashMap<>();
    public Deck(){
        for (int i = 1; i <= 9; i++){
            frequency.put(i, 0);
        }
    }

    public void add(int i){
        frequency.replace(i, frequency.get(i)+1);
    }

    public int consec(){
        int sets = 0;
        for (int k: frequency.values()){
            sets += (k >= 3)? 1:0;
        }
        return sets;
    }

    public int row(){
        int sets = 0;
        Iterator<Integer> iter = frequency.values().iterator();
        int first = iter.next(), mid = iter.next();
        while(iter.hasNext()){
            int tmp = iter.next();
            if (tmp >= 1 && mid == 1 && first >= 1) sets++;
            first = mid;
            mid = tmp;
        }
        return sets;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            LinkedHashMap<Character, Deck> colorDeck = new LinkedHashMap<>();
            colorDeck.put('R', new Deck()); colorDeck.put('G', new Deck()); colorDeck.put('B', new Deck());
            int number_list[] = new int[9];
            for (int j = 0; j < 9; j++) number_list[j] = sc.nextInt();
            for (int j = 0; j < 9; j++) colorDeck.get(sc.next().charAt(0)).add(number_list[j]);
            int sets = 0;
            for (Deck deck: colorDeck.values()) sets  += deck.consec() + deck.row();
            System.out.println((sets >= 3)? 1:0);
        }
    }
}