import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args){
        final int[][][] house = new int[4][3][10];
        final int n = Integer.parseInt(sc.next());
        for(int i = 0; i<n; i++){
            final int b = Integer.parseInt(sc.next());
            final int f = Integer.parseInt(sc.next());
            final int r = Integer.parseInt(sc.next());
            final int v = Integer.parseInt(sc.next());
            house[b-1][f-1][r-1] += v;
        }
        for(int i = 0; i<4; i++){
            if(i!=0) out.println("####################");
            for(int j = 0; j<3; j++){
                for(int k = 0; k<10; k++){
                    out.print(' ');
                    out.print(house[i][j][k]);
                }
                out.println();
            }
        }
        out.flush();
    }
}