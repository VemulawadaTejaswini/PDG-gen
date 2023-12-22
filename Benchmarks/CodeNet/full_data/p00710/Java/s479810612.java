import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n == 0 && r == 0){
                break;
            }
            int[] card = new int[n];
            for(int i = 0; i < n; i++){
                card[i] = i + 1;
            }
            for(int i = 0; i < r; i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                int[] cutcard = new int[c];
                for(int j = 0; j < c; j++){
                    cutcard[j] = card[n - p - c + j + 1];
                }
                for(int j = 0; j < p - 1; j++){
                    card[n - p - c + j + 1] = card[n - p + j + 1];
                }
                for(int j = 0; j < c; j++){
                    card[n - c + j] = cutcard[j];
                }
            }
            System.out.println(card[n - 1]);
        }
        sc.close();
    }
}
