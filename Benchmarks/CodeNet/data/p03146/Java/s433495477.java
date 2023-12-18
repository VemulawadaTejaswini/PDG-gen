import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int N = sc.nextInt();
        int ans = 0;
        
        for(int i=1; i<=1000000; i++){
            if(N==4 || N==2 || N==1){
                ans = i+3;
                break;
            }else{
                N = f(N);
            }
        }
        System.out.println(ans);
    }
    
    public static int f(int n){
        if(n%2 == 0){
            n = n/2;
        }else{
            n = 3*n+1;
        }
        return n;
    }
}