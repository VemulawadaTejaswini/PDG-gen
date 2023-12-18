import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];

        for(int i = 0; i < n; i++){
            cards[i] = sc.nextInt();
        }

        int aliceScore = 0;
        int bobScore = 0;

        sortDesc(cards);

        for(int j = 0; j < n; j++){
            if(j % 2 == 0){
                aliceScore += cards[j];
            } else {
                bobScore += cards[j];
            }
        }
        System.out.println(aliceScore - bobScore);
        sc.close();
    }

    private static void sortDesc(int[] array){
        int len = array.length;
        for(int i = 1; i < len; i++){
            int tgt = array[i];
            for(int j = i-1; j >= 0; j--){
                if(tgt > array[j]){
                    array[j + 1] = array[j];
                    array[j] = tgt;
                } else {
                    break;
                }
            }
        }
    }

}
