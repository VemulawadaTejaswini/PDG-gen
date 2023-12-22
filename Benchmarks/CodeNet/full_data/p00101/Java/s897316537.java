import java.io.BufferedReader;
import java.io.InputStreamReader;


public class p0101 {
    
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            String strDataNum = br.readLine();
            int dataNum = Integer.parseInt(strDataNum);
            
            for (int itr = 0; itr < dataNum; itr ++) {
                String replacedLine = br.readLine().replace("Hoshino", "Hoshina");
                System.out.println(replacedLine);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
        }
        
    }
    
}