import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        for(int i = 0; i < line.length(); i++){
            char a = line.charAt(i);
            char b = (char)(a - 3);
            System.out.print(b);
        }
        
        System.out.println();
    }
}