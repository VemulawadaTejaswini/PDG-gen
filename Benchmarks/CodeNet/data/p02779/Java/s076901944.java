import java.util.*;

public class Main{

    static int mod = (int) 1e9 + 7;
    static int dx[] = {-1, 0, 1, 0}, dy[] = {0, -1, 0, 1};
    static int INF = Integer.MAX_VALUE/2;

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        //Queue<int[]> q = new ArrayDeque<int[]>();
        Integer n = new Integer(scan.nextInt());
        ArrayList<Long> a = new ArrayList<Long>();

        for(int i=0;i<n;i++) a.add(scan.nextLong());
    
        Collections.sort(a);

        long bef = a.get(0);
        boolean flag = true;
        for(int i=1;i<a.size();i++){
            if(bef == a.get(i)){
                flag = false;
            }
            bef = a.get(i);
        }

        if(flag)
            System.out.println("YES");
        else
        System.out.println("NO");
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}