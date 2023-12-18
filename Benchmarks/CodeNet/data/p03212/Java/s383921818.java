import java.util.Scanner;

public class Main {
    
    static int n;
    static int count;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        n = Integer.parseInt(sc.next());
        count = 0;
        
        a("", "7");
        a("", "5");
        a("", "3");
        
        System.out.println(count);
    }
    
    private static void a(String s, String s2){
        
        s += s2;
        if(Long.parseLong(s) > n){
            return;
        }
        
        if(s.contains("7") && s.contains("5") && s.contains("3")){
            count++;
        }
        
        a(s, "7");
        a(s, "5");
        a(s, "3");
    }
}