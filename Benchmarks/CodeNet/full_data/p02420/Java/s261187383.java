import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String key = scan.next();
            if(key.equals("-")) break;
            int n = scan.nextInt();
            for(int i = 0;i < n;i++){
                int h = scan.nextInt();
                String tmpStr = key.substring(0, h);
                key = key.substring(h, key.length()) + tmpStr;
            }
            System.out.println(key);
        }
    }
}