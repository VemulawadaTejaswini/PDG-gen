import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());

            int voteAll = 0;

            ArrayList<Integer> list = new ArrayList<Integer>();

            for(int i = 0; i < n; i++){
                int vote = Integer.parseInt(sc.next());
                voteAll += vote;

                addGood(list, vote);
            }

            for(int j = 0; j < list.size() - m; j++){
                list.remove(0);
            }

            if(list.get(0) < (1 / (4 * voteAll))){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }            
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }

    private static void addGood(ArrayList<Integer> list, int vote){
        
        if(list.size() == 0){
            list.add(vote);
        }else{
            for(int i = 0; i < list.size(); i++){
                if(list.get(i) <= vote && vote <= list.get(i + 1)){
                    list.add(i, vote);
                    break;
                }
                if(i == list.size() - 1){
                    list.add(vote);
                }
            }
        }
    }
}
