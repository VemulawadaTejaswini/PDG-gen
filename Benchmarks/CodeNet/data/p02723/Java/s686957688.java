import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.S;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        if(S.matches("...\1.\1")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
