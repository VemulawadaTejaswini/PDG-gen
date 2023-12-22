import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n = sc.nextInt();
                int r = sc.nextInt();
                if(n == 0 && r == 0) break;

                int[] card = new int[n];
                for(int i=0; i<card.length; i++){
                    card[i] = n-i;
                }

                for(int i=0; i<r; i++){
                    int p = sc.nextInt();
                    int c = sc.nextInt();

                    int[] move = new int[c];
                    for(int j=0; j<move.length; j++) {
                        move[j] = card[p - 1 + j];
                    }

                    int[] cut = new int[p-1];
                    for(int j=0; j<p-1;j++){
                        cut[j] = card[j];
                    }

                    for(int k = 0; k<p-1; k++){
                        card[k+c] = cut[k];
                    }

                    for(int l = 0; l<c; l++){
                        card[l] = move[l];
                    }

                }
                System.out.println(card[0]);
            }
        }
    }
}
