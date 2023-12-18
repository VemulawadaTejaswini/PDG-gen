import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int w = Integer.parseInt(scan.next());
        int h = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        
        
        if((2*x == w)&& (2*y == h)){
            System.out.println(w * h / 2.0 + " 1");
        }else{
            System.out.println(w * h / 2.0 + " 0");
        }
    }
}
