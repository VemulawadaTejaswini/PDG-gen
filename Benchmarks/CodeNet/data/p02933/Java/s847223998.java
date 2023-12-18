import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]){
    		String result = "red";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(br.readLine());
            String s = br.readLine();
            if (a >= 3200) {
            		result = s;
            }    
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println(result);
    }
}