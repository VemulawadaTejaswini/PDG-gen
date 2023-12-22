import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long X = sc.nextInt();
        long M = (long)Math.pow(X, 0.2);

        boolean find = false;
        //A^5+B^5 = Xのパターン
        for(long a = 0 ; a <= M && !find ; a++){
            for(long b = a ; Math.pow(a,5)+Math.pow(b,5) <= X && !find ; b++){
                if(Math.pow(a,5)+Math.pow(b,5) == X){
                    System.out.println(""+a+" "+(-b));
                    find = true;
                }
            }
        }

        //A^5-B^5 = Xのパターン
        for(long a = M ; !find ; a++){
            for(long b = 0 ; Math.pow(a,5)-Math.pow(b,5) >= X && !find ; b++){
                if(Math.pow(a,5)+Math.pow(b,5) == X){
                    System.out.println(""+a+" "+b);
                    find = true;
                }
            }
        }

        return;
    }
}
