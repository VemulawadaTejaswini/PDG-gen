import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> temp = new ArrayList<>();
        int sLength = s.length();
        for (int i = 0; i < sLength; i++) {
            temp.add(s.substring(i,i+1));
        }
        int min = 999;
        int tempInt = 0;
        for (int i = 0; i < sLength - 2; i++) {
            tempInt = Integer.parseInt(temp.get(i)+temp.get(i+1)+temp.get(i+2));
            int res = 753-tempInt;
            
            res = res<0?res*-1:res;
            min = min<res?min:res;
        }
        
        
        System.out.println(min);
    }
}
