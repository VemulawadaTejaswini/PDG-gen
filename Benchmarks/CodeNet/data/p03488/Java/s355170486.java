import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean dir = true;
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        int fs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'T'){
                if (fs != 0){
                    if (dir) x.add(fs);
                    else y.add(fs);
                }
                dir = !dir;
                fs = 0;
            }
            else fs++;
        }

        if (fs != 0){
            if (dir) x.add(fs);
            else y.add(fs);
        }
        
        if (y.isEmpty()) y.add(0);
        if (x.isEmpty()) x.add(0);
        
        int xi = scanner.nextInt();
        int yi = scanner.nextInt();
        int sum1 = 0;
        for (Integer aX : x) {
            sum1 += aX;
        }
        int sum2 = 0;
        for (Integer aX : y) {
            sum2 += aX;
        }

        
        if (((sum1 - xi) % 2 != 0) || (sum2 - yi) % 2 != 0) System.out.println("No");
        else if (isSubsetSum(x, x.size(), (sum1 - xi)/2) && isSubsetSum(y, y.size(), (sum2 - yi)/2)) System.out.println("Yes");
        else System.out.println("No");
    }

    private static boolean isSubsetSum(ArrayList<Integer> set, int n, int sum) {
        if (sum == 0) return true;
        boolean subset[][] = new boolean[sum+1][n+1];

        // If sum is 0, then answer is true
        for (int i = 0; i <= n; i++)
            subset[0][i] = true;

        // If sum is not 0 and set is empty, then answer is false
        for (int i = 1; i <= sum; i++)
            subset[i][0] = false;

        // Fill the subset table in botton up manner
        for (int i = 1; i <= sum; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                subset[i][j] = subset[i][j-1];
                if (i >= set.get(j-1))
                    subset[i][j] = subset[i][j] ||
                            subset[i - set.get(j-1)][j-1];
            }
        }
        return subset[sum][n];
    }
}
