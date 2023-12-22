import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String W = br.readLine();
        int count = 0;
        String str;
        while(!(str = br.readLine()).equals("END_OF_TEXT")){
            String str2[] = str.split(" ");
            for(String s:str2){
                if(s.equalsIgnoreCase(W)) count++;
            }
        }
        System.out.println(count);
    }
}