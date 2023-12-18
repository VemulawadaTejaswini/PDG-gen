import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        
        int aturn = 0;
        int bturn = 0;
        int cturn = 0;
        
        char check = 'a';
        while(true)
        {
            switch(check)
            {
                case 'a':
                    check = NextA(aturn,a);
                    aturn++;
                    break;
                
                case 'b':
                    check = NextB(bturn,b);
                    bturn++;
                    break;
                    
                case 'c':
                    check = NextC(cturn,c);
                    cturn++;
                    break;
                    
                default:
                    return;
            }
        }
    }
    
    static char NextA(int aturn,String a){
        if(aturn == a.length())
        {
            System.out.println("A");
            return 'z';
        }
        else
        {
            return a.charAt(aturn);
        }
    }
    
    static char NextB(int bturn,String b){
        if(bturn == b.length())
        {
            System.out.println("B");
            return 'z';
        }
        else
        {
            return b.charAt(bturn);
        }
    }
    
    static char NextC(int cturn,String c){
        if(cturn == c.length())
        {
            System.out.println("C");
            return 'z';
        }
        else
        {
            return c.charAt(cturn);
        }
    }
}