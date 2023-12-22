import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count += Integer.parseInt("" + s.charAt(i));
        }
        if(count % 9 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
