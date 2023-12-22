import java.io.PrintWriter;
import java.util.Scanner;

class Main{
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args){
        while(true){
            final int m = Integer.parseInt(sc.next());
            final int f = Integer.parseInt(sc.next());
            final int r = Integer.parseInt(sc.next());
            if(m==-1&&f==-1&&r==-1) break;
            if(m==-1||f==-1) out.println('F');
            else if(m+f>=80) out.println('A');
            else if(m+f>=65) out.println('B');
            else if(m+f>=50) out.println('C');
            else if(m+f<30) out.println('F');
            else if(r>=50) out.println('C');
            else out.println('D');
        }
        out.flush();
    }
}