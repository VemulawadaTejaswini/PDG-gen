import java.util.*;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        //ここまで入力
        long tmp = function(N);
        String str = String.valueOf(tmp);
        long ans = 0;

        for(int i=str.length(); i>0; i--){
            if(str.charAt(i-1) != '0') break;
            ans++;
        }
        System.out.println(ans);
    }

    //function
    public static long function(long x){
    if(x < 2) return 1;
    return x * function(x - 2);
    }
}