import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  aa = new int[n], bb = new int[n], dif = new int[n], sum = new int[n];
        Pair[] p = new Pair[n];
        ArrayList<Pair> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            aa[i] = sc.nextInt();
            bb[i] = sc.nextInt();
            sum[i] = aa[i] + bb[i];
            al.add(new Pair(aa[i], bb[i]));
        }
        Collections.sort(al);
        long ans = 0;

        for(int i = n-1; i >= 0; i--){
            if((n - i) % 2 == 1){
                ans += al.get(i).a;
            }
            else{
                ans -= al.get(i).b;
            }
        }
        System.out.println(ans);
    }

}

class Pair implements Comparable<Pair>
{
    int a, b, sum;
    Pair(int x, int y)
    {
        a = x; b = y; sum = a + b;
    }
    @Override
    public int compareTo( Pair p ){
      return this.sum - p.sum;
    }
}