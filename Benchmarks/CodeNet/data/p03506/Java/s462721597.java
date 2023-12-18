import java.io.PrintWriter;
import java.util.Scanner;
class Main{

    public static int N;
    private static int parent(int k){
        return (k+(N-2))/N;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        int Q = scan.nextInt();
        PrintWriter out = new PrintWriter(System.out);
        while(Q-->0){
            int u = Integer.parseInt(scan.next());
            int v = Integer.parseInt(scan.next());
            int cnt = 0;
            if(N!=1){
            while(u != v){
                while(u > v)u = parent(u);
                while(v > u)v = parent(v);
            }
            }else{
                u = Math.min(u,v);
            }
            out.println(u);
        }
        out.flush();
    }
}