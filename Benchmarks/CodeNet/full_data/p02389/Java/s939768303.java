import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int S = a*b;
        int L = 2*a+2*b;
        System.out.println(S + " " + L);
    }
}