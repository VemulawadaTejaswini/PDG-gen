import java.io.*;

class Main {
        public static void main (String[] args) throws IOException {
                int i = 1;
                while (true) {
                        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
                        String str = br.readLine ();
                        int num = Integer.parseInt (str);
                        if (num == 0) break;
                        System.out.println ("Case " + i + ": " + num);
                        i++;
                }
        }
}