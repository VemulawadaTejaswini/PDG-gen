import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean isYes = false;
        for(int i =1 ; i<= b ; i++) {
            if(a * i % b == c) {
                isYes = true;
                break;
            }
        }

        if (isYes) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}