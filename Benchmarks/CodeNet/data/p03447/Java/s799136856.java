import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int c = Change(x-a,b);
        System.out.println(c);
    }
    
    public static int Change(int a,int b){
        return a%b;
    }
}