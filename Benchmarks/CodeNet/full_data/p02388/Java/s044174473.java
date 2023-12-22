import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    string s = in.readLine();
    int x = Integer.parseInt(s);
    int res = x * x * x;
    System.out.println(res);
    }
}