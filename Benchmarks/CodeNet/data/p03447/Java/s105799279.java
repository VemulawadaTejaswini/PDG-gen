import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int X,A,B,ans;

        X = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();


        ans = X - A;
        int C = ans/B;
        ans = ans - C*B;


        System.out.println(ans);

    }
}