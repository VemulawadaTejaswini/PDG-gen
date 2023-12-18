import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    String[] line2 = br.readLine().split(" ");
    
    int numAllDice = Integer.parseInt(line1[0]);
    int numPlayDice = Integer.parseInt(line1[1]);
    double max = 0;
    double temp = 0;
    int next;
    
    int[] dice = new int[numAllDice];
    
    for(int i=0; i<numPlayDice; i++){
      dice[i] = Integer.parseInt(line2[i]);
      max += (dice[i]+1)/2.0;
    }
    temp = max;
    
    for(int i=0; i<numAllDice-numPlayDice; i++){
      next = Integer.parseInt(line2[i+numPlayDice]);
      dice[i+numPlayDice] = next;
      temp += ((next+1)-(dice[i]+1))/2.0;
      if(max < temp){
        max  = temp;
      }
    }
    System.out.println(max);
  }
}