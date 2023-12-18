import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        String S = sc.next();
        Map<Integer, Integer> mp = new HashMap<>();
        int[] mods = new int[S.length()+1];
        mods[S.length()] = 0;
        mp.put(0, 1);
        for(int i=S.length()-1;i>=0;i--){
            int num = S.charAt(i)-'0';
            mods[i] = mod10(num, S.length()-i-1, P) + mods[i+1];
            mods[i] %= P;
//            mods[i] = (mods[i+1]+num*10) % P;
            mp.put(mods[i],mp.computeIfAbsent(mods[i], (k)->0)+1);
        }
        long sum = 0;
        for(Integer t:mp.keySet()){
            sum += mp.get(t)*(mp.get(t)-1)/2;
        }
        System.out.println(sum);
    }
    private static int mod10(int a, int keta, int P){
        for(int i=0;i<keta;i++){
            a = a * 10;
            a = a % P;
        }
        return a;
    }
}
