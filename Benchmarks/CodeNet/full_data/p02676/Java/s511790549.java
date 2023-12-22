import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        
        // 格納
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String word = scan.next();
        String word1;
        if(a <= word.length()){
            word1 = word.substring(0,a);
            if(word1.length() < word.length()){
                System.out.println(word1 + "...");
            }else{
                word1 = word.substring(0,a);
                System.out.println(word1);
            }
        }else{
            System.out.println(word);
        }
    }
}
        