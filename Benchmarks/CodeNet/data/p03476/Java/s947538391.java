import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = null;
        PrintWriter writer = null;
        
        try {
            reader =new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            int query = Integer.parseInt(reader.readLine());
            String readLine;
            
            while((readLine = reader.readLine()) != null){
                int ans = 0;
                String[] splitLine = readLine.split(" ");
                int start = Integer.parseInt(splitLine[0]), 
                    end = Integer.parseInt(splitLine[1]);

                for(int i = start; i <= end; i += 2){
                    int likeNumber = (i + 1) / 2;
                    boolean IsItSosu = i > 2;
                    for(int x = 2; x < i / 2 + 1; x ++){
                        if(i % x == 0){
                            IsItSosu = false;
                            break;
                        }
                    }
                    if(IsItSosu){
                        for(int x = 2; x < likeNumber / 2 + 1; x ++){
                            if(likeNumber % x == 0){
                                    IsItSosu = false;
                                    break;
                                }
                        }

                    }
                    if(IsItSosu){   ans ++; }

                }

                writer.println(ans);
                
            }
            
            
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