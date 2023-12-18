
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String s = in.next();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= s.length() - 3; i++) {
            String temp = s.substring(i,i+3);
            int number = Integer.parseInt(temp);
            min = Math.min(min,Math.abs(number-753));
        }
        System.out.println(min);

    }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int sum1 = sumOfArray(h1,0);
        int sum2 = sumOfArray(h2,0);
        int sum3 = sumOfArray(h3,0);

        if(sum1==sum2 && sum2==sum3) return sum1;

        int index = 0;

        while (sum1!=sum2 && sum2!=sum3) {

        }

        return 0;
    }

    static int sumOfArray(int [] a,int index) {
        int sum = 0;
        for (int i = index; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }

    public boolean checkInclusion(String s1, String s2) {
        int [] mainFreq = frequency(s1);
        int length = s1.length();
        for (int i = 0; i <=s2.length() - length; i++) {
            String temp = s2.substring(i,length+i);
            int [] freq = frequency(temp);
            boolean check = checkFrequencies(mainFreq,freq);
            if(check) return true;
        }
        return false;
    }

    public List<Integer> findAnagrams(String s, String p) {
        int [] mainFreq = frequency(p);
        int length = p.length();

        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i <=s.length()-length; i++) {
            String temp = s.substring(i,length+1);
            int [] freq = frequency(temp);
            if(checkFrequencies(freq,mainFreq)) indexes.add(i);
        }
        return indexes;
    }
    private static boolean checkFrequencies(int [] freqA, int [] freqB) {
        for (int i = 0; i < freqA.length; i++) {
            if(freqA[i]!=freqB[i]) return false;
        }
        return true;
    }

    private static int [] frequency(String s) {
        int [] freq = new int[26];
        for (char c:s.toCharArray()) {
            freq[c-'a']++;
        }
        return freq;
    }
    static int lowerBound(int [] a, int target) {
        int lo = 0;
        int hi = a.length - 1;
        int ans = -1;

        while (lo<=hi) {
            int med = hi - (hi-lo)/2;
            if(target == a[med]){
                ans = med;
                hi = med - 1;
            }
            else if(target < a[med])  hi = med - 1;
            else lo = med + 1;
        }
        return ans;
    }

    static int upperBound(int [] a, int target) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo<=hi) {
            int med = hi-(hi-lo)/2;
            if(target>=a[med]) lo = med + 1;
            else hi = med - 1;
        }
        return hi;
    }
    static boolean isPrime(int n) {
        if(n<=2) return false;
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0) return  false;
        }
        return  true;
    }
    static int [] readAnArray(int n) {
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        return  a;
    }
}

