import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Card[] c1 = new Card[n];
        Card[] c2 = new Card[n];
        String[] t = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            c1[i] = new Card(); c2[i] = new Card();
            c1[i].suit = t[i].charAt(0);
            c1[i].value = t[i].charAt(1);
        }

        for(int i = 0; i < n; i++) c2[i] = c1[i];

        babble(c1, n);
        selection(c2, n);
        if(isSame(c1, c2, n))System.out.println("Stable");
        else System.out.println("Not stable");
    }

    public static void babble(Card[] a, int n){
        Card temp = new Card();
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j >= i + 1; j--){
                if(a[j].value < a[j-1].value){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        print(a, n);
        System.out.println("Stable");
    }
 public static void selection(Card[] a, int n){
        Card temp = new Card();
        for(int i = 0; i < n; i++){
            int minj = i;
            for(int j = i; j < n; j++){
                if( a[j].value < a[minj].value) minj = j;
            }
            if(i != minj){
                temp = a[i]; a[i] = a[minj]; a[minj] = temp;
            }
        }
        print(a, n);
    }

    public static void print(Card[] a, int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i != 0) sb.append(" ");
            sb.append(a[i].suit).append(a[i].value);
        }
        System.out.println(sb);
    }

    public static boolean isSame(Card[] a, Card[] b, int n){
        for(int i = 0; i < n; i++){
            if(a[i].suit != b[i].suit)return false;
        }
        return true;
    }

}

class Card{
    char suit, value;
    /*Card(char suit, char value){                                                     
        this.suit = suit;                                                              
        this.value = value;                                                            
        }*/
}