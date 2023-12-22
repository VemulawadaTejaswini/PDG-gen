import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        String str;
        
        try {
            while(reader.ready()){
                str = reader.readLine();

                int n = str.length();
                for (int i = n; i > 0; i--){
                    System.out.print(str.substring(i-1, i));
                }
                System.out.println();
                
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
