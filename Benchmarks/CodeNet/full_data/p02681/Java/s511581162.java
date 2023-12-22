
import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String t = scan.nextLine();

        if(s.equals(t.substring(0,t.length()-1))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}