import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String sub = s.substring(i,j);
                long a = Long.parseLong(sub);
                if(a % 2019 == 0){count++;}
            }
        }
        System.out.println(count);
        return;
    }
}