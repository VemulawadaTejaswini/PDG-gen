import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] P_E = br.readLine().split(" ");

        int PlayerNum = Integer.parseInt(P_E[0]);
        int EventNum = Integer.parseInt(P_E[1]);
        
        int[] Fishes = new int[PlayerNum + 1];
        Arrays.fill(Fishes, 0);
        
        int TopPlayerID = 0;
        int TopPlayersFishes = 0;
        
        for(int i = 0; i < EventNum; i++){
            String[] P_G = br.readLine().split(" ");
            int PlayerID = Integer.parseInt(P_G[0]);
            int GetFishNum = Integer.parseInt(P_G[1]);
            Fishes[PlayerID] += GetFishNum;
            
            if(TopPlayersFishes < Fishes[PlayerID]){
                TopPlayerID = PlayerID;
                TopPlayersFishes = Fishes[PlayerID];
            }
            else if(TopPlayersFishes == Fishes[PlayerID]){
                TopPlayerID = PlayerID < TopPlayerID ? PlayerID : TopPlayerID;
            }
            else{
                if(TopPlayerID == PlayerID){
                    int MaxFishes = 0;
                    for(int p = 0; p < Fishes.length; p++){
                        if(MaxFishes < Fishes[p]){
                            MaxFishes = Fishes[p];
                            TopPlayerID = p;
                        }
                        else if(MaxFishes == Fishes[p]){
                            TopPlayerID = p < TopPlayerID ? p : TopPlayerID;
                        }
                    }
                    TopPlayersFishes = MaxFishes;
                }
            }
            
            System.out.println(TopPlayerID + " " + TopPlayersFishes);
        }
    }
}

class TopPlayer {
    public int PlayerID;
    public int Fishes;
    TopPlayer(int InputID, int InputFishes){
        PlayerID = InputID;
        Fishes = InputFishes;
    }
}