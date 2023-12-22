import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] caBefore = new String[n];
        
        for (int i = 0; i < n; i++)
            caBefore[i] = sc.next();
        
        String[] caAfter = caBefore.clone();
//        String[] ca2Before = caBefore.clone();
        String[] ca2After = caBefore.clone();
        
        //　バブルソート
        for (int i = 0; i < n; i++)
            for (int j = n - 1; j >= i + 1; j--)
                if (caAfter[j].charAt(1) < caAfter[j-1].charAt(1))
                    swap(caAfter, j, j-1);
                    
        printlnArray(caAfter);
        System.out.println("Stable");
        
        // 選択ソート
        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i+1; j < n; j++) {
                if (ca2After[minj].charAt(1) > ca2After[j].charAt(1)) {
                    minj = j;
                }
            }
            swap(ca2After, minj, i);
        }
        
        printlnArray(ca2After);
        boolean isStable = true;
        for (int i = 0; i < n; i++) {
            if (!ca2After[i].equals(caAfter[i])) {
                isStable = false;
            }
        }
        System.out.println(isStable ? "Stable" : "Not Stable");
    }
    
    static void swap(String[] ca, int i, int j) {
        String temp = ca[i];
        ca[i] = ca[j];
        ca[j] = temp;
    }

    private static void printlnArray(String[] ca) {
        for (int i = 0; i < ca.length - 1; i++) {
            System.out.print(ca[i] + " ");
        }
        System.out.println(ca[ca.length - 1]);
    }
}
