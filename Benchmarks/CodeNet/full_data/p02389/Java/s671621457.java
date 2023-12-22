import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        String s1, s2;
        int x, y;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
        s1 = r.readLine();
        s2 = r.readLine();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);

        System.out.println((a*b) + " " + (2*a+2*b));
    }
}