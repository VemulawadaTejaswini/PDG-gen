import java.util.*;

public class Main {
    public static int LCS(String i, String j) {
        int[][] table = new int[i.length()+1][j.length()+1];
        for (int x = 1; x <= i.length(); x++) {
            for (int y = 1; y <= j.length(); y++) {
                table[x][y] = (i.charAt(x-1) == j.charAt(y-1)) 
                    ? table[x-1][y-1] + 1
                    : Math.max(table[x-1][y], table[x][y-1]);
            }
        }
        return table[i.length()][j.length()];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt() * 2;
        String[] sequences = new String[q];
        for (int i = 0; i < q; i++)
            sequences[i] = in.next();
        for (int i = 0; i < q; i += 2)
            System.out.println(LCS(sequences[i], sequences[i+1]));
    }
}

