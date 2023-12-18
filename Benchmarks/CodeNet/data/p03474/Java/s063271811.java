import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        String code = sc.next();
        boolean result = false;
        //System.out.println(code);

        if(a >= 1 && b <= 5){
            if(code.length() == a + b + 1) {
                for(int i = 0; i < code.length(); i++){
                    char token = code.charAt(i);
                    //System.out.println(token);
                    if(i == a && token == '-') {
                        result = true;
                    } else if (i != a && !Character.isDigit(token)) {
                        System.out.println("No");
                    }
                }
            }
        }

        if(result){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
