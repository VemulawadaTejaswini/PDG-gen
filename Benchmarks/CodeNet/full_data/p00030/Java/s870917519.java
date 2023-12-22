import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class SumInt{
    public HashSet<HashSet<Integer>> sets = new HashSet<>();

    public void calc(HashSet<Integer> set, int k, int n, int s) {
        if (n == 0){
            sets.add(set);
        }
        else {
            for (int i = k; i <= s; i++) {
                HashSet<Integer> tmp = new HashSet<>(set);
                tmp.add(i);
                calc(tmp, i,n - 1, s - i);
            }
        }
    }

    public int count(int n, int s){
        int count = 0;
        Iterator<HashSet<Integer>> iter = sets.iterator();
        while (iter.hasNext()){
            HashSet<Integer> tmp = iter.next();
            if (tmp.size() == n){
                Iterator<Integer> intIter = tmp.iterator();
                int sum = 0;
                while(intIter.hasNext()){
                    sum += intIter.next();
                }
                if (sum == s) count++;
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt(), s = sc.nextInt();
            if (n ==0 && s ==0)break;
            SumInt si = new SumInt();
            HashSet<Integer> tmp = new HashSet<>();
            si.calc(tmp, 0, n, s);
            System.out.println(si.count(n, s));
        }
    }
}