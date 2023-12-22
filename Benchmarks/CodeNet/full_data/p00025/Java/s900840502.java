import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while( (line = br.readLine()) != null){
            String[] inputAstr = line.split(" " , 4);
            String[] inputBstr = br.readLine().split(" " , 4);

            int[] inputA = new int[4];
            int[] inputB = new int[4];

            int hit = 0;
            int blow = 0;

            for(int i = 0; i < 4; i++){
                inputA[i] = Integer.valueOf(inputAstr[i]);
                inputB[i] = Integer.parseInt(inputBstr[i]);
            }

            outer:
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(inputA[i] == inputB[j]){
                        
                        if(i == j)  hit++;
                        else blow++;

                        continue outer;
                    }
                }
            }

            System.out.println(hit + " " + blow);
            
        }
    }
}