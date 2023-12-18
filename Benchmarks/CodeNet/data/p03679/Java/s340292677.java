import java.util.*;

class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = X + A;
        String ans;
        if( A > B){
            ans = "delicious";
        }else if(A < B && B <= C){
            ans = "safe";
        }else{
            ans = "dangerous";
        }
        System.out.println(ans);
    }
}