import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        String a = null;
        
        if(Y%2 != 0){
            a = "No";
        } else if(X*2 <= Y && Y <= X*4){
            a = "Yes";
        } else {
            a = "No";
        }
        System.out.println(a);
    }
}
