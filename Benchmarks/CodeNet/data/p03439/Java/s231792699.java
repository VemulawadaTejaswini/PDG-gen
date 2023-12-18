import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // 捜査の範囲
        int start = 1;
        int end = n - 1;
        
        System.out.print(0);
        String chairZero = sc.next();
        
        PrintWriter out = new PrintWriter(System.out);
        int query;
        while(true) {
            query = (end + start) / 2;
//            System.out.print(query);
            out.print(query);
            out.flush();
//            System.out.flush();
            
            String response = sc.next();
            if (response.equals("Vacant")) {
                return;
            }

            boolean isSame = response.equals(chairZero);
            boolean isDiffEven = (query - start) % 2 == 0;
            
            if (isSame && isDiffEven)
                end = query - 1;
            else if (isSame && !isDiffEven)
                start = query + 1;
            else if (!isSame && isDiffEven)
                start = query;
            else if (!isSame && !isDiffEven)
                end = query;
        }
    }
}