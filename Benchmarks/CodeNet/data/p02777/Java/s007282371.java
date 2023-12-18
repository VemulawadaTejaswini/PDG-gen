import java.util.*;

public class Main{

    static int mod = (int) 1e9 + 7;
    static int dx[] = {-1, 0, 1, 0}, dy[] = {0, -1, 0, 1};
    static int INF = Integer.MAX_VALUE/2;

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        //Queue<int[]> q = new ArrayDeque<int[]>();
        String s = scan.next();
        String t = scan.next();
        Integer a = new Integer(scan.nextInt());
        Integer b = new Integer(scan.nextInt());
        String u = scan.next();
        
        if(u.equals(s)){
            System.out.println((a-1) + " " + b);
        }else{
            System.out.println(a + " " + (b-1));
        }

    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}