import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strings = sc.next();
        int count = 0;
        for(char string: strings.toCharArray()) {
            if (string == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}