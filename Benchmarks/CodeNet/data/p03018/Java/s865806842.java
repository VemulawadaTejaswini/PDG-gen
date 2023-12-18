import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int count = 0;
        
        String s = stdIn.next();
        char c[] = s.toCharArray();
        
        for(int i = 0; i < c.length - 2; i++){
            if(c[i] == 'A' && c[i + 1] == 'B' && c[i + 2] == 'C'){
                char tmp = c[i];
                c[i] = c[i + 1];
                c[i + 1] = c[i + 2]; 
                c[i + 2] = tmp;
                count++;
                i = 0;
            }
        }
        System.out.println(count);
    }
}
