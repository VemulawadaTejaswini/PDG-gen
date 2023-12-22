import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            String key = scan.next();
            if(key.equals("-")) break;
            int n = scan.nextInt();
            for(int i = 0;i < n;i++){
                int ch = scan.nextInt();
                String tmpStr = key.substring(0, ch);
                key.concat(tmpStr);
            }
            System.out.println(key);
        }
    }
}