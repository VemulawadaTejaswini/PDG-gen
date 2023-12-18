import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if(line.equals("a") ||line.equals("i")||line.equals("u")||line.equals("e")|| line.equals("o")){
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}