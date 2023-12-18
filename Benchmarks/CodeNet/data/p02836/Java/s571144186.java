import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        int count = 0;
        for(int i = 0; i < word.length()/2; i++){
          //System.out.println(word.substring(i, i+1) + " " + word.substring(word.length()-1, word.length()));
          if(!word.substring(i, i+1).equals(word.substring(word.length()-1-i, word.length()-i)))
            count++;
        }

        System.out.println(count);
    }
}