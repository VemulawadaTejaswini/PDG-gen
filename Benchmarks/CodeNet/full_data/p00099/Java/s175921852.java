import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int q = Integer.parseInt(s.next());
        int[] ar = new int[n+1];
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 1; i <= n; i++){
            int key = 0 * 1000001 + (n-i);
            set.add(key);
        }
        for(int i = 0; i < q; i++){
            int a = Integer.parseInt(s.next());
            int v = Integer.parseInt(s.next());
            int old_key = ar[a] * 1000001 + (n-a);
            ar[a] += v;
            int new_key = ar[a] * 1000001 + (n-a);
            set.remove(old_key);
            set.add(new_key);
            int max_a = n-(int)(set.last()) % 1000001;
            int max_v = (int)(set.last()) / 1000001;
            System.out.println(max_a + " " + max_v);
        }
    }
}