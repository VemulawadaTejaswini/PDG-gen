import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        long[] b = new long[n];
        Map<Integer, Long> m = new HashMap<>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextLong();
            if(!m.containsKey(a[i])) m.put(a[i], (long)0);
            m.put(a[i], m.get(a[i]) + b[i]);
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++)
            b[i] = m.get(a[i]);
        int j = 0;
        long tmp = 0;
        while(tmp < k){
            if(j > 0 && a[j] == a[j-1]) continue;
            tmp += b[j];
            j++;
        }
        System.out.println(a[j-1] + 1);
    }
}