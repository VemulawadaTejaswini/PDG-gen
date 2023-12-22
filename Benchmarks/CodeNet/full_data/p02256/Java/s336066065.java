import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        String buf = br.readLine();
//        int x = Integer.parseInt(buf);
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        System.out.println(gcd(x,y));
    }
    
    static int gcd(int x, int y){
        int a = Math.max(x, y);
        int b = Math.min(x, y);
        
        while(b > 0){
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

}