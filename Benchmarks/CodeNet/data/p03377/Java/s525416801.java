import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       b = sc.nextInt();
       x = sc.nextInt();
       
       if(a > x || a + b < x){
           System.out.println("No");
       }else{
           System.out.println("Yes");
       }
       
    }
}
