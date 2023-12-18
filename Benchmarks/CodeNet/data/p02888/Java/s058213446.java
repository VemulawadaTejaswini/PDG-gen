import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }

        Arrays.sort(l);

        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (l[k] >= (l[j]+l[i])) {
                        break;
                    }
                    ans++;
                }
            }
        }

        System.out.println(ans);

        sc.close();
    }    
}
