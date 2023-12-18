// not solved by myself
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int As[] = new int[N];

        for(int i = 0;i < N;i++){
            As[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int a : As) {
            if (maps.keySet().contains(a)) {
                int nums = maps.get(a);
                maps.put(a, nums + 1);
            } else {
                maps.put(a, 1);
            }
        }

        int cuts = 0;
        for(int a: maps.keySet()){
            int nums = maps.get(a);
            if(nums < a)
                cuts += nums;
            else
                cuts += (nums - a);
        }

        System.out.println(cuts);

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



