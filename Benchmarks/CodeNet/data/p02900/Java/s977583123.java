import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = kys(a,b);
        int res = 1;
        res = res + bk(c,0);
        System.out.println(res);
    }
    static int kys(int a,int b){
        if(b == 0){return a;}
        return kys(b,a % b);
    }
    static int bk(int c,int plus){
        if(c == 1){return plus;}else{
            for(int i = 2;i<=c;i++){
                if(c % i == 0){
                    plus++;
                    return wr(c,i,plus);
                }
            }
        }
        return plus;
    }
    static int wr(int c,int i,int plus){
        while(c % i == 0){
            c = c / i;
        }
        return bk(c,plus);
    }
}
