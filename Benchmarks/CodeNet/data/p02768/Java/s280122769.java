import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int bunbo;
        int bunshi;
        int res = 0;
        
        for(int i=1; i<=N; i++){
            if(i == a || i == b){
            } else {
                bunshi = 1;
                bunbo = 1;
                for(int j=1; j<=i; j++){
                    bunbo = bunbo * j;
                    bunshi = bunshi * (N-j+1);
                }
                
                res = res + bunshi/bunbo;
            }
        }

        res = res%((int) Math.pow(10,9)+7);
        System.out.println(res);   

        
    }
}
