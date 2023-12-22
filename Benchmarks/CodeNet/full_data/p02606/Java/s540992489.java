import java.util.*;
public class NumberOfMultiples {

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        while(a<=b){
            if((a++%c)==0) count++; 
        }
        System.out.println(count);
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}