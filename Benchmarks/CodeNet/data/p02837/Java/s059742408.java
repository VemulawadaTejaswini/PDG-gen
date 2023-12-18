
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        int N = scan.nextInt();
        for(int i = 0; i < N; i++) {
            int A = scan.nextInt();
            HashMap<Integer, Integer> subMap = new HashMap<>();
            for(int j = 0; j < A; j++) {
                int x = scan.nextInt() - 1;
                int y = scan.nextInt();
                subMap.put(x,y);
            }
            map.put(i, subMap);
        }

        int ans = 0;
        long allPattern = (long)Math.pow(2.0, N);
        for(long i = 0; i < allPattern; i++) {
            boolean isAllTrue = true;
            int numOf1 = 0;
            for(int j = 0; j < N; j++) {
                long tmp = i;
                tmp >>= j;
                if((tmp & 1) == 1) {
                    numOf1++;
                    HashMap<Integer, Integer> subMap = map.get(j);
                    boolean isTrue = true;
                    for(Entry<Integer, Integer> entry :subMap.entrySet()) {
                        tmp = i;
                        tmp >>= entry.getKey();
                        if((tmp & 1) != entry.getValue()) {
                            isTrue = false;
                            break;
                        }
                    }
                    if(!isTrue) {
                        isAllTrue = false;
                        break;
                    }
                }
            }
            if(isAllTrue) {
                if(ans < numOf1)
                    ans = numOf1;
            }
        }

        os.println(ans);
    }

}