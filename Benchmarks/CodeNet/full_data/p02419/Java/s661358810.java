import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String word = br.readLine().toUpperCase();
        int count = 0;
        while (true){
            String line = br.readLine();
            if (line==null|line=="END_OF_TEXT"){
                break;
            }
            String[] ln = line.split("[.,!\"?:... ]");
            for (int i=0; i<ln.length; i++){
                //System.out.println(ln[i]);
                String tmp = ln[i].toUpperCase();
                if (tmp.equals(word)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}