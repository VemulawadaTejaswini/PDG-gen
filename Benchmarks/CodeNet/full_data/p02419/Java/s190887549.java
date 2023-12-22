import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word  = sc.next();
        String targetWord = word;
        int count = 0;
        while(!(word.equals("END_OF_TEXT"))){
            word = sc.next();
            if(word.equalsIgnoreCase(targetWord)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
