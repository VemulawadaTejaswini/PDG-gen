import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args){
        while(true){
            final int h = Integer.parseInt(sc.next());
            final int w = Integer.parseInt(sc.next());
            if(h==0||w==0) break;
            for(int i = 0; i<w; i++)
                out.print('#');
            out.println();
            for(int i = 1; i<h-1; i++){
                out.print('#');
                for(int j = 1; j<w-1; j++){
                    out.print('.');
                }
                out.println('#');
            }
            for(int i = 0; i<w; i++)
                out.print('#');
            out.println();
            out.println();
        }
        out.flush();
    }
}