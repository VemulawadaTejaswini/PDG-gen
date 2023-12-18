import java.util.*;

import javax.print.DocFlavor.STRING;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();

        if(n % 2 == 0){
            String a = s.substring(0, n / 2 -1);
            String b = s.substring(n / 2, n -1);
            
            if(a.equals(b)){
                System.out.println("Yes");
                return;
            }
            System.out.println("No");
        }else{
            System.out.println("No");
        }



    }
}
