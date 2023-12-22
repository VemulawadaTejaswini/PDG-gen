import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String X = sc.next();
            String Y = sc.next();
            int lenX = X.length();
            int lenY = Y.length();
            
            int[][] lcs = new int[lenX+1][lenY+1];
            
            for(int x = 1; x <= lenX; x++) {
                for (int y = 1; y <= lenY; y++) {
                    if (X.charAt(x-1) == Y.charAt(y-1)) {
                        lcs[x][y] = lcs[x-1][y-1] + 1; 
                    } else {
                        lcs[x][y] = Math.max(lcs[x-1][y], lcs[x][y-1]);
                    }
                }
            }
            System.out.println(lcs[lenX][lenY]);
        }
    }
}
