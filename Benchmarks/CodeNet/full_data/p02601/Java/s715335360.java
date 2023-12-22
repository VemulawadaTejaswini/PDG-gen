import java.util.Scanner;

public class Main {
    
    static boolean yes;
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        yes = false;
        rec(a, b, c, k);
        
        if(yes){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    static void rec(int a, int b, int c, int k){
        
        if(k < 0 || yes){
            return;
        }
        if(b > a && c > b){
            yes = true;
            return;
        }
        
        rec(a*2, b, c, k-1);
        rec(a, b*2, c, k-1);
        rec(a, b, c*2, k-1);
    }
}