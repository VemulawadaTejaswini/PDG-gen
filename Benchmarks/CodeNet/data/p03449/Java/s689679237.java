import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = null;
        PrintWriter writer = null;
        
        try {
            reader =new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            int N = Integer.parseInt(reader.readLine());
            int[] topLine = Arrays.asList(reader.readLine().split(" ")).stream()
                            .mapToInt(w -> Integer.parseInt(w))
                            .toArray();
            int[] bottomLine = Arrays.asList(reader.readLine().split(" ")).stream()
                               .mapToInt(w -> Integer.parseInt(w))
                               .toArray();
            int[] amechanNum = new int[N];
            
            for(int i = 0; i < N; i++){
                int topAmechanNum = 0;
                int bottomAmechanNum = 0;
                
                for(int a = 0; a < i + 1; a++) topAmechanNum += topLine[a];
                for(int b = i; b < N; b++) bottomAmechanNum += bottomLine[b];
                
                amechanNum[i] = topAmechanNum + bottomAmechanNum;    
                
            }
            Arrays.sort(amechanNum);
                    
            writer.println(amechanNum[N - 1]);
            
        }finally{
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        }

    }
}