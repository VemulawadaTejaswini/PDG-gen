import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long count = 0;
        String words[] = new String[n];
        String s1 = stdIn.next();
        char c1[] = s1.toCharArray();
        Arrays.sort(c1);
        s1 = String.valueOf(c1);
        
        for(int i = 0; i < n - 1; i++){
            String s = stdIn.next();
            char c[] = s.toCharArray();
            Arrays.sort(c);
            words[i] = String.valueOf(c);
        }
        
        for(int i = 0; i < n - 1; i++){
            if(s1.equals(words[i])){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
