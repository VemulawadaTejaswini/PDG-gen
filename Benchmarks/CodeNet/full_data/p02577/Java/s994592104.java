import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count = (count + Integer.parseInt("" + s.charAt(i))) % 9;
        }
        if(count == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
