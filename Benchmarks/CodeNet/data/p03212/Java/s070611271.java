import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        function(0,0,0,0);
        System.out.println(count);
    }
    static int count = 0;
    static int n;
    static void function(long num, int a, int b, int c){
        if (a>0&&b>0&&c>0&&(num<=n)){
            count++;
        }
        if (num>n){
        }else{
            if (num*10<n){
                function(num*10+3,a+1,b,c);
                function(num*10+5,a,b+1,c);
                function(num*10+7,a,b,c+1);
            }
        }
    }
}