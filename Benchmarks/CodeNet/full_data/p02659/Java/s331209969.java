import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long A = sc.nextLong();
        double B = sc.nextDouble();
        sc.close();
        long Ans = Math.round(Math.floor(A*B));
        if(A == 0 || B == 0){
            System.out.println(0);
/*        }else if(Ans == 0 ){
            System.out.println(-1);*/
        }else{
            System.out.println(Ans);
        }
    }
}
