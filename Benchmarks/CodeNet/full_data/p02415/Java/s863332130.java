import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        String result = "";
        for(int i=0; i<line.length(); i++){
            char c = line.charAt(i);
            if (Character.isUpperCase(c) ) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c) ) {
                result += Character.toUpperCase(c);
            } else {
                result += c;
            }
        }
        System.out.println(result);
        
    }
}

