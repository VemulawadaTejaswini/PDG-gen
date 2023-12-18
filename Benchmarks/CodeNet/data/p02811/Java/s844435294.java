import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int X = sc.nextInt();
        String a = null;
        
        if(X>= K*500){
            a = "Yes";
        } else {
            a = "No";
        }
        System.out.println(a);
    }
}
