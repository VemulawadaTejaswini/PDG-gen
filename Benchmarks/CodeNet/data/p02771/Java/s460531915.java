import java.util.*;

public class Main{

    static int mod = (int) 1e9 + 7;
    static int dx[] = {-1, 0, 1, 0}, dy[] = {0, -1, 0, 1};
    static int INF = Integer.MAX_VALUE/2;

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        //Queue<int[]> q = new ArrayDeque<int[]>();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(((a==b)&&(b!=c)) || ((b==c)&&(c!=a)) || ((c==a)&&(a!=b)))   
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}