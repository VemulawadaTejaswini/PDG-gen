import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args){
        final int r = Integer.parseInt(sc.next());
        final int c = Integer.parseInt(sc.next());
        final int[][] cells = new int[r+1][c+1];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                final int num = Integer.parseInt(sc.next());
                cells[i][j] = num;
                cells[r][j] += num;
                cells[i][c] += num;
                cells[r][c] += num;
            }
        }
        for(final int[] cell:cells){
            boolean first = true;
            for(final int element:cell){
                if(first) first = false;
                else out.print(' ');
                out.print(element);
            }
            out.println();
        }
        out.flush();
    }
}