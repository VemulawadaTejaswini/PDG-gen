import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Long X = Long.parseLong(s);
        String line = sc.next();
        Long Y = Long.parseLong(line);
        Long sum = X * 2;
        int count = 2;
        
        while(true){
            sum = sum * 2;
            if(sum > Y || count == (X)){
                System.out.println(count);
                System.exit(0);
            }
            count++;
        }
    }
}