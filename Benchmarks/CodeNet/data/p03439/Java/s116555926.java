//import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // 捜査の範囲
        int start = 1;
        int end = n - 1;
        
        System.out.println(0);
        System.out.flush();
        
        String chairZero = sc.next();
        if (chairZero.equals("Vacant")) {
            return;
        }
        
//        PrintWriter out = new PrintWriter(System.out);
        int query;
        for (int i = 0; i < 20; i++) {
            query = (end + start) / 2;
            System.out.println(query);
            System.out.flush();
//            out.print(query);
//            out.flush();
            
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
