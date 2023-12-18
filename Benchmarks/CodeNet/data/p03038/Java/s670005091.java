import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        int cardNum = scanner.nextInt();
        int moveNum = scanner.nextInt();
        
        ArrayList<Integer> cards = new ArrayList<Integer>(cardNum);
        for(int i = 0;i < cardNum; i++){
            cards.add(scanner.nextInt());
        }
        
        Collections.sort(cards);
        
        int changeNum = 0;
        int targetNum = 0;
        for(int i=0;i < moveNum; i++){
            changeNum = scanner.nextInt();
            targetNum = scanner.nextInt();
            
            int inspos = 0,j = 0;
            for(;j<cards.size();j++){
                if(targetNum  < cards.get(j)){
                    break;
                }
            }
            inspos = j;
            for(j=0;j<changeNum;j++){
                int tmp = cards.get(0);
                if(tmp > targetNum){
                    break;
                }
                cards.add(inspos,targetNum);
                cards.remove(0);
            }
            
        }
        
        long sum = 0;
        for (int i=0;i<cards.size();i++){
            sum += cards.get(i);
        }
        System.out.println(sum);
    }
}
