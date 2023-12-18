import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        String S = sc.next();
        long sum=0;
        if(P == 2 || P == 5){
            for(int i=S.length()-1;i>=0;i--){
                int num = S.charAt(i);
                if(num % P == 0){
                    sum += (i+1);
                }
            }
            System.out.println(sum);
            return;
        }


        Map<Integer, Integer> mp = new HashMap<>();
        int[] mods = new int[S.length()+1];
        int m10 = 1;
        mods[S.length()] = 0;
        mp.put(0, 1);
        for(int i=S.length()-1;i>=0;i--){
            int num = S.charAt(i)-'0';
            mods[i] = m10 * num % P + mods[i+1];
            mods[i] %= P;
            m10 *= 10;
            m10 %= P;
            mp.put(mods[i],mp.computeIfAbsent(mods[i], (k)->0)+1);
        }
        for(Integer t:mp.keySet()){
            sum += mp.get(t)*(mp.get(t)-1)/2;
        }
        System.out.println(sum);
    }
}
