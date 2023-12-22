import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.io.*;

class Table{
    int[] cards;
    int zero;
    int move;
    int prev_zero;
    
    Table(int[] cards_){
        cards = cards_;
        move = 0;
        for (int i=0;i<8;i++){
            if(cards[i]==0){
                zero = i;
                break;
            }
        }
        prev_zero = -1;
    }
    
    Table swapped(int from,int dest){
        int[] cpAr = new int[8];
        System.arraycopy(cards, 0, cpAr, 0, 8);
        Table ans = new Table(cpAr);
        
        int temp = ans.cards[from];
        ans.cards[from] = ans.cards[dest];
        ans.cards[dest] = temp;
        
        ans.zero = dest;
        ans.prev_zero = zero;
        ans.move = this.move+1;
        return ans;
    }
    
    boolean isEnd(){
        int[] answer = {0,1,2,3,4,5,6,7};
        
        return Arrays.equals(answer,cards);
    }
}

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line;
            while((line=reader.readLine()) != null){
                Queue<Table> queue = new ArrayDeque<Table>();
                
                int[] first = new int[8];
                
                for(int i=0;i<8;i++) first[i] = line.charAt(2*i)-'0';
                
                int[] answer = {0,1,2,3,4,5,6,7};
                
                if(Arrays.equals(answer,first)) {
                    System.out.println(0);
                    continue;
                }
                
                queue.add(new Table(first));
                
                while(true){
                    Table root = queue.poll();
                    
                    // dbg
                    //System.out.println("cards:");
                    //for (int i=0;i<4;i++) System.out.printf("%d ",root.cards[i]);
                    //System.out.println();
                    //for (int i=4;i<8;i++) System.out.printf("%d ",root.cards[i]);
                    //System.out.println();
                    //System.out.println("move:" + root.move);
                    //System.out.println("zero:" + root.zero);
                    //System.out.println();
                    
                    // left
                    if(root.zero%4!=0 && root.zero-1!=root.prev_zero){
                        Table swapped_table = root.swapped(root.zero,root.zero-1);
                        if(swapped_table.isEnd()){
                            System.out.println(swapped_table.move);
                            break;
                        }
                        queue.add(swapped_table);
                    }
                    // right
                    if(root.zero%4!=3 && root.zero+1!=root.prev_zero){
                        Table swapped_table = root.swapped(root.zero,root.zero+1);
                        if(swapped_table.isEnd()){
                            System.out.println(swapped_table.move);
                            break;
                        }
                        queue.add(swapped_table);
                    }
                    // up&down
                    if(root.zero<4 && root.zero+4!=root.prev_zero){
                        Table swapped_table = root.swapped(root.zero,root.zero+4);
                        if(swapped_table.isEnd()){
                            System.out.println(swapped_table.move);
                            break;
                        }
                        queue.add(swapped_table);
                    } else if (root.zero>3 && root.zero-4!=root.prev_zero){
                        Table swapped_table = root.swapped(root.zero,root.zero-4);
                        if(swapped_table.isEnd()){
                            System.out.println(swapped_table.move);
                            break;
                        }
                        queue.add(swapped_table);
                    }
                }
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }
}