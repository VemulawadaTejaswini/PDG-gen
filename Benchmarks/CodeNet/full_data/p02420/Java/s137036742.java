import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      try{
        String line1;
        char[] ch = new char[200000];
        while(!(line1 = reader.readLine()).equals("-")){
             for(int i = 0; i < line1.length(); i++){
               ch[i] = line1.charAt(i);
             }
             int l = 0;
             int r = line1.length() - 1;
             String line2 = reader.readLine();
             int m = Integer.parseInt(line2);
             int[] h = new int[m];
             for(int i = 0; i < m; i++){
               String line3 = reader.readLine();
               h[i] = Integer.parseInt(line3);
               for(int j = 0; j < h[i]; j++){
                  ch[r + 1 + j] = ch[l + j];
               }
               l += h[i];
               r += h[i];
             }
             for(int i = l; i <= r; i++){
               System.out.print(ch[i]);
             }
             System.out.println();
        }
      }catch(IOException e){

      }
    }
}
