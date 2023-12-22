import java.util.*;
public class Main {
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        if(n<600) System.out.println(8);
        else if((n>=600)&&(n<800)) System.out.println(7);
        else if((n>=800)&&(n<1000)) System.out.println(6);
        else if((n>=1000)&&(n<1200)) System.out.println(5);
        else if((n>=1200)&&(n<1400)) System.out.println(4);
        else if((n>=1400)&&(n<1600)) System.out.println(3);
        else if((n>=1600)&&(n<1800)) System.out.println(2);
        else if((n>=1800)&&(n<2000)) System.out.println(1);
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}