// not solved by myself

import java.util.*;
import java.util.Map.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        ArrayList<String> Ss = new ArrayList<>();
        if (N == 0){
            System.out.println(0);
            return;
        }

        while(N != 1){
            if (Math.abs(N) % 2 == 1){
                Ss.add("1");
                N = (N - 1) / (-2);
            }else{
                Ss.add("0");
                N /= (-2);
            }
        }
        Ss.add("1");

        ArrayList<String> Ss_list = new ArrayList<>();
        for(int i = 0; i < Ss.size();i++)
            Ss_list.add(Ss.get(i));
        Collections.reverse(Ss_list);


        StringJoiner sj = new StringJoiner("");
        Arrays.stream(Ss_list.toArray()).forEach(s -> sj.add(String.valueOf(s)));

        System.out.println(sj.toString());


    }

    // nCr を求める
    // 第1引数: 列挙対象の配列 n
    // 第2引数: r
    // 第3引数: 答えの組み合わせ配列を保持するための set
    public static <T> void combination(ArrayList<T> n,Integer r,HashSet<ArrayList<T>> ans){
        if (n.size() == r){
            ans.add(n);
            return;
        }

        for(int i = 0; i < n.size(); i++){
            ArrayList<T> N = new ArrayList<>(n);
            N.remove(i);
            combination(N,r,ans);
        }
    }

    public static List<Entry<Integer,Integer>> SortMapByValue(HashMap<Integer,Integer> maps,boolean is_reverse){
        List<Entry<Integer,Integer>> entries = new ArrayList<>(maps.entrySet());

        Collections.sort(entries, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return (is_reverse ? -1 : 1) * o1.getValue().compareTo(o2.getValue());
            }
        });

       return entries;
    }

     public static long max(int[] ar,int size){
        long max = 0;
        for(int i = 0; i< size;i++)
            if(max < ar[i])
                max = ar[i];
        return max;
    }


    public static long max(List<Long> ar){
        long max = 0;
        for(int i = 0; i< ar.size();i++)
            if(max < ar.get(i))
                max = ar.get(i);
        return max;
    }

    public static Integer min(List<Integer> ar){
        int min = 10000;
        int index = 0;
        for(int i = 0; i< ar.size();i++){
            if(min > ar.get(i)){
                min = ar.get(i);
                index = i;
            }
        }
        return min;
    }


    public static long gcd(long m, long n) {
        if(m == 0)
            return n;
        if(n == 0)
            return m;
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}