
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] f = new int[n/2];
        int[] s = new int[n/2];
        int j = 0;
        int k = 0;
        for (int i = 0;  i < n; i++) {
            if (i%2 == 0) {
                f[j++] = sc.nextInt();
            } else {
                s[k++] = sc.nextInt();
            }
        }

        int evenNum = 0;
        int oddNum = 0;

        Object[] even = keisan(f).keySet().toArray();
        Object[] odd = keisan(s).keySet().toArray();
        
        int[] evenMax = new int[even.length];
        int[] oddMax = new int[odd.length];

        for (int i = 0; i < evenMax.length; i++) {
            evenMax[i] = (int)even[i];
        }
        for (int i = 0; i < oddMax.length; i++) {
            oddMax[i] = (int)odd[i];
        }

        if (evenMax[0] == oddMax[0]) {
            if (evenMax.length > evenNum+1) {
                evenNum++;
            }else if (oddMax.length > oddNum+1) {
                oddNum++;
            } else {
                oddMax[0] = -1;
            }
        }

        int rel = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] != evenMax[evenNum]) {
                rel++;
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] != oddMax[oddNum]) {
                rel++;
            }
        }
        System.out.println(rel);
        sc.close();
    }

    static Map<Integer, Integer> keisan (int[]arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put((Integer)arr[i], (map.get(arr[i]) == null ? 0 : map.get(arr[i]))+1);
        }
     return map;
    }
}
