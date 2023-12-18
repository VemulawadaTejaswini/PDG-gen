import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long k = scan.nextLong();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = scan.nextInt() - 1;
        int c = 1;
        int index = 0;
        List<Integer> loop = new ArrayList<>();
        TreeSet<Integer> seen = new TreeSet<>();
        loop.add(0);
        seen.add(0);
        while(!seen.contains(a[index])){
            loop.add(a[index]);
            seen.add(a[index]);
            index = a[index];
            c++;
        }
        int start = loop.indexOf(a[index]) + 1;
        if(loop.size() - start > k){
            System.out.println(a[(int)k] + 1);
            return;
        }
        c -= loop.size() - start;
        System.out.println(loop.get((int)(k % c)) + 1);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}