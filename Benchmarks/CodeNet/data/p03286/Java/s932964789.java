import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(n);
        }
        else{
            while(n!=0){
                System.out.print(mod2(n));
                n = div2(n);
           }
        }
    }
    public static int div2(int n){
        if(n<0&&n%(-2)==-1){
            n = n-1;
        }
        return n / (-2);
    }
    public static int mod2(int n){
        if(n<0){
            n = -n;
        }
        return n % (-2);
    }
}