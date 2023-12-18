import java.util.*;
class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int mod = 2019;
        int L = sc.nextInt();
        int R = sc.nextInt();
        int l = L%mod;
        int r = R%mod;
        int result = 2019;
        if(R-L>mod)result=2;
        else if(l<r){
            result = l*(l+1);
        }
        else{
            result = r*(r+1);
        }
        result = result%mod;
        System.out.println(result);
    }
}