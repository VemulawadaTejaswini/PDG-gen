import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String result = "";
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        
        if (a < b && b > c || a > b && b < c){
            result = "Yes";
        } else {
            result = "No";
        }
        
        System.out.println(result);
    }
}
