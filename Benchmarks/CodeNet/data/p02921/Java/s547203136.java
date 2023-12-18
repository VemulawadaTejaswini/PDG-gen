import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        char c[] = s.toCharArray();
        String t = stdIn.next();
        char d[] = t.toCharArray();
        int count = 0;
        
        for(int i = 0; i < 3; i++){
            if(c[i] == d[i]){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
