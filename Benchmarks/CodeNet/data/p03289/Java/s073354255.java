import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String word = input.readLine();

        for (int i = 0; i < word.length(); i++) {
            if (i ==0 && word.charAt(i) != 'A'){
                System.out.println("WA");
                return;
            }else if (i == 2 &&  word.charAt(i) != 'C'){
                System.out.println("WA");
                return;
            }else if (i != 2 && i != 0 && Character.isUpperCase(word.charAt(i))){
                System.out.println("WA");
                return;
            }
        }
        System.out.println("AC");
    }
}
