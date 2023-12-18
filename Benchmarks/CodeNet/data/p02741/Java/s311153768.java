import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String a = "1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51";
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        int k = Integer.parseInt(str);
        String[] v = a.split(",", 0);
        int _v = Integer.parseInt(v[k - 1].trim());

        System.out.println(_v);
        
    }
}
