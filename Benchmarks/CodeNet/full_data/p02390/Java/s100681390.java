import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        String s = r.readLine();
        int S = Integer.parseInt(s);
        
        int h, m, sec;
        
        h = S / 3600;
        S = S % 3600;
        m = S / 60;
        sec = S % 60;
        
        System.out.println(h + ":" + m + ":" + sec);
    }
}