import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        int r = 700;
        for(char c  : in.toCharArray()){
            if(c == 'o'){
                r += 100;
            }
        }
        System.out.println(r);
    }
}