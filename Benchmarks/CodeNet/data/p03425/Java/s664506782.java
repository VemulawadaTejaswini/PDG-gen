// not solved by myself
import sun.net.www.content.text.Generic;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String Ss[] = {"M","A","R","C","H"};
        ArrayList<String> targets = new ArrayList<>(Arrays.asList(Ss));


        HashMap<Character,Integer> initials = new HashMap<>();
        for(int i = 0; i < N; i++){
            Character name = sc.next().toCharArray()[0];
            if(initials.keySet().contains(name))
                initials.put(name,initials.get(name) + 1);
            else
                initials.put(name,1);
        }

        int res = 0;
        HashSet<ArrayList<String>> combs = new HashSet<>();
        combination(targets,3,combs);
        for(ArrayList<String> inis: combs){
            int tmp = 1;
            for(String initial: inis){
                if (initials.containsKey(initial.toCharArray()[0]))
                    tmp *= initials.get(initial.toCharArray()[0]);
                else
                    tmp = 0;
           }
           res += tmp;
        }

        System.out.println(res);
    }

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



