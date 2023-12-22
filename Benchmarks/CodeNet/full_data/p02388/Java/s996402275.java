import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream r = new DataInputStream(System.in);
        String s = r.readLine();
        int x = Integer.parseInt(s);
        x = x*x*x;
        
        System.out.println(x);
    }
}