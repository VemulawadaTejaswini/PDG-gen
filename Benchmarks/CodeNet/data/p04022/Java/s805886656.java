/**
 * Created on 2016/08/22.
 */

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static HashMap<Long, Long> pairs = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> tmpPrimeNumbers = getPrimeNumbers(3000);
        ArrayList<Long> primeNumbers = new ArrayList<>();

        for(int prime: tmpPrimeNumbers){
            primeNumbers.add((long) prime);
        }

        int N = sc.nextInt();

        HashMap<Long, Integer> norms = new HashMap<>();


        for(int i=0; i<N; i++){
            long tmp = sc.nextLong();
            // 標準系になおして、pairを計算
            long tmpNorm = getNorms(tmp, primeNumbers);

            //
//            System.out.println("Input:" + tmp);
//            System.out.println("Calculated Norm:" + tmpNorm);

            if(norms.containsKey(tmpNorm)){
                int cnt = norms.get(tmpNorm);
                cnt++;
                norms.put(tmpNorm, cnt);
            }else{
                norms.put(tmpNorm, 1);
            }
        }

        int ans = 0;

        HashSet<Long> set = new HashSet<>();

        boolean one = false;

//        System.out.println("(Norm, Count)");
//        viewMap(norms);

        for(long norm: norms.keySet()){
//            System.out.println("norm = " + norm);
            if(norm == 1){
                one = true;
                continue;
            }

            int cnt = norms.get(norm);

            long pair = pairs.get(norm);
//            System.out.println("pair = " + pair);


            if(set.contains(norm)){
                continue;
            }

            if(norms.containsKey(pair)){
                int candidateCnt = norms.get(pair);

                int add;

                if(cnt >= candidateCnt){
                    add = cnt;
                    set.add(pair);
                }else{
                    add = 0;
                }

                ans += add;
//                 TODO  remove
//                System.out.println("norm: " + norm + "\tpair:" + pair + "\tadd: " + add);

                set.add(norm);
            }else{
                ans += cnt;
            }
        }

        if(one){
            ans++;
        }

        System.out.println(ans);
    }

    private static long getNorms(long target, ArrayList<Long> primeNumbers) {

        long retNorm = 1;

        HashMap<Long, Integer> hashMap = new HashMap<>();

        boolean isPrime = true;

        // 3次未満
        for(long prime: primeNumbers){

            if(target % prime != 0) continue;
//            if(target < prime) break;
            isPrime = false;

            long tmpTarget = target;

            int tmpCnt = 0;

            while (tmpTarget % prime == 0){
                tmpTarget /= prime;
                tmpCnt++;
            }

            tmpCnt %= 3;

            if(tmpCnt != 0){
                retNorm *= (tmpCnt * prime);
                hashMap.put(prime, tmpCnt);
            }

        }

        if(isPrime){
            pairs.put(target, 1L);
            return target;
        }

        // calc Pair
        if(!pairs.containsKey(retNorm)){
            long tmpPair = getPair(hashMap);
//            System.out.println("target = " + target);
//            viewMap(hashMap);
//            System.out.println("calc Pair = " + tmpPair);
            pairs.put(retNorm, tmpPair);
            pairs.put(tmpPair, retNorm);
        }




        return retNorm;

    }

    private static long getPair(HashMap<Long, Integer> primes) {
        long ret = 1;

        for(long key: primes.keySet()){
            int tmpCnt = primes.get(key);

            if(tmpCnt == 1){
                ret *= (key* key);

            }else{
                ret *= (key);
            }
        }
        return ret;
    }


    // Algorithms
    private static ArrayList<Integer> getPrimeNumbers(int upperLimit) {
        ArrayList<Integer> ret = new ArrayList<Integer>();

        ret.add(2);
        ret.add(3);

        for (int i = 5; i <= upperLimit; i += 2) {
            boolean isPrime = true;
            // 素数で平方根まで試し割りしてみる
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                ret.add(i);
            }
        }
        return ret;
    }

    // View Method
    //* List
    public static <T> void viewList(List<T> list) {
        for (T item : list) {
            System.out.print(item + "\t");
        }
        System.out.println("");
    }

    //* Map
    public static <K, V> void viewMap(Map<K, V> map) {
        Set<K> keys = map.keySet();
        for (K key : keys) {
            System.out.print("(" + key + ", " + map.get(key) + ")\t");
        }
        System.out.println("");
    }

    //* Matrix
    public static void viewIntMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
