import java.util.Scanner;
/**
 * 2018-04-14
 * https://beta.atcoder.jp/contests/abc094/tasks/abc094_a
 */
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int  A = sc.nextInt();
        int  B = sc.nextInt();
        int  X = sc.nextInt();

  //      System.out.println(A);
  //      System.out.println(B);
  //      System.out.println(X);


        String ans = null;
        if(A < X && (A+B)>X){
            ans ="YES";
        }else{
            ans ="NO";
        }

        System.out.println(ans);
        

    }
}
