import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String p = sc.next();
        
        String text = s + s;
        
        if(text.contains(p)) System.out.println("Yes");
        else System.out.println("No");
    }
}
