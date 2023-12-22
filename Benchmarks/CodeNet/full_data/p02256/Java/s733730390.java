import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String in = br.readLine();
        final int x = Integer.parseInt(in.substring(0, in.indexOf(' ')));
        final int y = Integer.parseInt(in.substring(in.indexOf(' ')+1));
        System.out.println(gcd(x, y));
    }
    private static int gcd(int x, int y){
        while(true){
            x %= y;
            if(x==0)
                return y;
            y %= x;
            if(y==0)
                return x;
        }
    }
}