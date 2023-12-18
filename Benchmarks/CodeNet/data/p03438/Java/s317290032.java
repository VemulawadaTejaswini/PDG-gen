import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter writer = null;
        
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            int lineNum = Integer.parseInt(br.readLine());
            int[] firstLine = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(e -> Integer.parseInt(e))
                                .toArray();
            int[] secondLine = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(e -> Integer.parseInt(e))
                                .toArray();
            int difference = 0;
            int firstLineSum = Arrays.stream(firstLine).sum();
            int secondLineSum = Arrays.stream(secondLine).sum();
            String ans = "No";
            
            while(true){
                if(firstLineSum >= secondLineSum) break;
                for(int i = 0; i < lineNum; i++){
                    if(firstLine[i] > secondLine[i]) difference += firstLine[i] - secondLine[i];
                }
                if(secondLineSum - firstLineSum < difference) break;
                ans = "Yes";
                break;
            }
            writer.println(ans);
            
        }finally{
            if(br != null){
                br.close();
            }
            if(writer != null){
                writer.close();
            }
        }

    }
}