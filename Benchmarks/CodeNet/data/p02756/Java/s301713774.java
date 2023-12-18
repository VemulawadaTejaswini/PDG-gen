import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e5+5;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int q = Integer.parseInt(sc.next());
        int r = 0;
        String[] z = {"",""};
        
        for(int i=0; i<q; i++){
            int t = Integer.parseInt(sc.next());
            if(t==1){
                r ^= 1;
            }else{
                int f = Integer.parseInt(sc.next());
                String c = sc.next();
                z[(r+f)%2] += c;
            }
        }
        
        String a = reverse(z[1]);
        String b = z[0];
        
        if(r==0){
            System.out.print(a);
            System.out.print(s);
            System.out.print(b);
        }else{
            System.out.print(reverse(b));
            System.out.print(reverse(s));
            System.out.print(reverse(a));
        }
        
        System.out.println();
    }
    
    public static String reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }
    
}
