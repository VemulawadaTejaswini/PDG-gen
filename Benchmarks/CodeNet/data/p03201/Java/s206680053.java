import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        sc.close();

        int npow = 32;
        long[] pow2 = new long[npow];
        for(int i=0; i<pow2.length; i++){
            pow2[i] = (long)Math.pow(2, i);
        }

        Collections.sort(a);

        int ans = 0;
        out: for(int i=a.size()-1; i>=0; i--){
            int cur = a.get(i);
            if(i > 0){
                int cur2 = a.get(i-1);
                if(cur == cur2){
                    for(int j=0; j<npow; j++){
                        if(cur*2 == pow2[j]){
                            ans++;
                            i--;
                            continue out;
                        }
                    }
                }
            }
            for(int j=0; j<npow; j++){
                if(cur >= pow2[j]) continue;
                int pos = Collections.binarySearch(a, (int)pow2[j]-cur, (ma, mb) -> Integer.compare(ma, mb));
                if(pos >= 0 && pos < i){
                    a.remove(i);
                    a.remove(pos);
                    i--;
                    ans++;
                    break;
                }
                break;
            }
        }

        System.out.println(ans);
    }
}