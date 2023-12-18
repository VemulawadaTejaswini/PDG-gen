import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        String[] InputNum = br.readLine().split(" ");
        int moneyAmount = Integer.parseInt(InputNum[0]);
        int moneyPrice = Integer.parseInt(InputNum[1]);
        
        br.close();
        
        for(int i = 0; i <= moneyAmount; i ++){
            for(int x = 0; x <= moneyAmount - i; x ++){
                if((moneyPrice -(i*10000 + x*5000))/1000 == (moneyAmount-(i + x))){
                    writer.println(i + " " + x + " " + (moneyAmount - (i + x)));
                    writer.close();
                    return;
                }
            }
        }
        writer.println("-1 -1 -1");
        
        writer.close();
    }
}