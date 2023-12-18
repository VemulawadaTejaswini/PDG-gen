import java.util.*;

public class Main{

    static int mod = (int) 1e9 + 7;
    static int dx[] = {-1, 0, 1, 0}, dy[] = {0, -1, 0, 1};
    static int INF = Integer.MAX_VALUE/2;

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        //Queue<int[]> q = new ArrayDeque<int[]>();
        Integer n = new Integer(scan.nextInt());
        Integer k = new Integer(scan.nextInt());
        ArrayList<Integer> p = new ArrayList<Integer>();

        for(int i=0;i<n;i++) p.add(scan.nextInt());
    
        //Collections.sort(a);

        int max = 0;
        int pos = 0;
        for(int i=0;i<n-k+1;i++){
            int sum = 0;
            for(int j=0;j<k;j++) sum += p.get(i+j);
            if(max < sum){
                pos = i;
                max = sum;
            }
        }

        double e = 0.0;
        for(int i=pos;i<pos+k;i++){
            double sum = 0.0;
            for(int j=1;j<=p.get(i);j++) sum += j;
            e += sum / p.get(i);
        }

        System.out.println(e);
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}