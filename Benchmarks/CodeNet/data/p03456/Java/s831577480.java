import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a += sc.next();
        double b = Double.parseDouble(a);
        if(Math.pow(b,0.5) % 1 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
