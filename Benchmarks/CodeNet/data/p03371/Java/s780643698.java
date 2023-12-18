import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if(X > Y){
            //Bの方が少ない時
            if(Y * B + Y * A < 2 * Y * C){
                //Y枚まで個別で買った方が安い時
                System.out.println(X * A + Y * B);
            }else{
                //Cピザの方がお得な時
                int Z = X - Y;
                if(2 * Y * C + A * Z < 2 * X * C){
                    System.out.println(2 * Y * C + A * Z);
                }else{
                    System.out.println(2 * C * X);
                }
            }
        }else if(Y > X){
            //Aの方が少ない時
            if(X * B + X * A < 2 * X * C){
                //Y枚まで個別で買った方が安い時
                System.out.println(X * A + Y * B);
            }else{
                //Cピザの方がお得な時
                int Z = Y - X;
                if(2 * X * C + B * Z < 2 * Y * C){
                    System.out.println(2 * X * C + B * Z);
                }else{
                    System.out.println(2 * C * Y);
                }
            }
        }else{
            //同枚数
            if(A * X + B * Y > 2 * C * X){
                //C買った方が安い時
                System.out.println(2 * C * X);
            }else{
                //別々の方がいい時
                System.out.println(A * X + B * Y);
            }
        }
    }
}