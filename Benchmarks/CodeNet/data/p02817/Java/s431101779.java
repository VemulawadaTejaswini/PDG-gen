import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
        String a= in.readLine ();
        String b= in.readLine ();
        System.out.println (b+a);
    }
}