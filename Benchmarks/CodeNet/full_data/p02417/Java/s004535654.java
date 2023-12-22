import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();
        char c;
        int count;
        for (c = 'a'; c <= 'z'; c++) {
            count = 0;
            for (char x : charArr) {
                if (x == c || x == Character.toUpperCase(c)) {
                    count++;
                }
            }
            System.out.println(c + " : " + count);
        }
    }
}