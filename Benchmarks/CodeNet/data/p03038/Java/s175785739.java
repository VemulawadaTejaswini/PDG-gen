import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        int cardNum = scanner.nextInt();
        int moveNum = scanner.nextInt();
        
        int[] cards = new int[cardNum];
        for(int i = 0;i < cards.length; i++){
            cards[i] = scanner.nextInt();
        }
        
        Arrays.sort(cards);
        
        int changeNum = 0;
        int targetNum = 0;
        for(int i=0;i < moveNum; i++){
            changeNum = scanner.nextInt();
            targetNum = scanner.nextInt();
            
            for(int j=0;j<changeNum;j++){
                if(cards[j] > targetNum){
                    break;
                }
                cards[j] = targetNum;
            }
            Arrays.sort(cards);
        }
        
        long sum = 0;
        for (int i=0;i<cards.length;i++){
            sum += cards[i];
        }
        System.out.println(sum);
    }
}
