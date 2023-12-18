import java.util.*;

public class Main {

    public static void main(String[] args) {
        int maxPlayers = 0;
        
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> playersInfo = new HashMap<>();
        int count = sc.nextInt();
        
        for(int i = 0; i < count; i++){
            playersInfo.put(sc.nextInt(), sc.nextInt());
        }

        int maxKey = Collections.max(playersInfo.keySet());
        int minValue = playersInfo.get(maxKey);
        
        if(minValue > 0){
            maxPlayers += minValue ;
        }
        maxPlayers += maxKey;
        
        System.out.println(maxPlayers);
    }
    
}