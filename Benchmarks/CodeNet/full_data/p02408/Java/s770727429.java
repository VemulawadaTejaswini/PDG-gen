import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        char suit;
        int value;
        boolean[] isMissing = new boolean[52];
        for(i = 0; i < 52; i++){ isMissing[i] = true; }
        for(i = 0; i < n; i++){
            suit = scan.next().charAt(0);
            value = scan.nextInt();
            isMissing[13 * toNum(suit) + value - 1] = false;
        }
        for(i = 0; i < 52; i++){
            if(isMissing[i]){
                System.out.println(toSuit(i / 13) + " " + ((i % 13) + 1));
            }
        }
    }

    public static int toNum(char suit){
        if(suit == 'S'){ return 0; }
        else if(suit == 'H'){ return 1; }
        else if(suit == 'C'){ return 2; }
        else if(suit == 'D'){ return 3; }
        return -1;
    }
    public static char toSuit(int num){
        switch(num){
            case 0: return 'S';
            case 1: return 'H';
            case 2: return 'C';
            case 3: return 'D';
        }
        return ' ';
    }
}
