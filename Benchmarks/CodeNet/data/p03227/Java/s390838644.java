import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();
        if (word.length() == 2){
            System.out.println(word);
        }else {
            System.out.println(revert(word));
        }
    }

    public static  String revert(String word){
        StringBuilder revetWord = new StringBuilder();
        for (int i = word.length() - 1; i > -1 ; i--) {
            revetWord.append(word.charAt(i));
        }
        return revetWord.toString();
    }
}
