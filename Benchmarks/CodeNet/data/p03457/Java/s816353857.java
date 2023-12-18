import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        int N = Integer.parseInt(reader.readLine()),
            time = 0, //経過時間
            nowx = 0,
            nowy = 0;
        
        String ans = "Yes";
        
        for(int i = 0; i < N; i++){
            String[] line = reader.readLine().split(" ");
            int t = Integer.parseInt(line[0]),
                x = Integer.parseInt(line[1]),
                y = Integer.parseInt(line[2]);
            
            if(Math.abs(x-nowx) + Math.abs(y-nowy) > t - time){
                ans = "No";
                break;
            }else if (Math.abs(x-nowx) + Math.abs(y-nowy) < t - time){
                int distance = (t - time) - (Math.abs(x-nowx) + Math.abs(y-nowy));
                
                if(distance != 0 && distance % 2 == 1 ){
                    ans = "No";
                    break;
                }
            }
            
            time = t;
            nowx = x;
            nowy = y;
            
        }
    
    writer.println(ans);
        
    reader.close();
    writer.close();
    }
}