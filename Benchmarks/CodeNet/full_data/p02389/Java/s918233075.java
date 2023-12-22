import java.io.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int s = br.read();
        br.skip(1);
        int t = br.read();
        
        int x = s * t;
        int y = s + s + t + t;
        System.out.println(x + '\n' + y);
    }
}
 