import java.io.*;
class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        
        String s = r.readLine();
        int x = Integer.parseInt(s);
        x = x*x*x;
        
        System.out.println(x);
    }
}