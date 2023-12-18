import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =  sc.nextInt();

        int[] d = new int[n];
        for(int i = 0; i < n ; i++){
            d[i] = sc.nextInt();
        }

        int idx = 0;
        int[] ds = new int[n*(n+1)/2];
        for(int i = 0; i < n ; i++){
            for (int len = 1 ; len <= n-i ; len++){
                int sum = 0;
                for(int j = i ; j < i+len; j++){
                    sum += d[j];
                }
                ds[idx] = sum;
                //System.out.print(ds[idx] + " ");                            
                idx++;
            }
            //System.out.println();
        }

        int max = 0;

        Set<Integer> src = new HashSet<Integer>();
        for(int i = 0; i < ds.length; i++){
            src.add(ds[i]);
        }

        Set<Set<Integer>> sets =  combination(src, k);

        for (Set<Integer> s : sets) {
            Iterator it = s.iterator();
            int sum = (int)(it.next());
            while(it.hasNext()){
                int sl = (int)(it.next());
                sum = sum & sl;
            }
            if(max < sum){
                max = sum;
            }
        }

        System.out.println(max);

    }

    private enum Operation {add, remove};
    private static<T> Set<T> apply(Set<T> src, Operation operation, T item) {
        Set<T> result = new HashSet<T>(src);
        if (Operation.add == operation) result.add(item);
        if (Operation.remove == operation) result.remove(item);
        return result;
    }

    private static<T> Set<Set<T>> _combination(Set<T> selected, int depth, Set<T> pool) {
        if (depth == 0) return apply(new HashSet<>(), Operation.add, selected); 
        Set<Set<T>> result = new HashSet<Set<T>>();
        for (T item : pool) {
            result.addAll(
                    _combination(
                            apply(selected, Operation.add, item), 
                            depth - 1, 
                            apply(pool, Operation.remove, item) 
                    )
            );
        }
        return result;
    }
    public static<T> Set<Set<T>> combination(Set<T> src, int k) {return _combination(new HashSet<T>(), k, src);}    
}