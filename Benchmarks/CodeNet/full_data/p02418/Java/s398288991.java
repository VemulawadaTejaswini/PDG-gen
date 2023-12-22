import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        char[] target = br.readLine().toCharArray();
        boolean answer = false;
        int i, j;
        loop: for (i = 0; i < str.length; i++) {
            if (str[i] == target[0]) {
                for (j = 1; j < target.length; j++) {
                    if (str[(i+j)%str.length] != target[j]) continue loop;
                }
                answer = true;
            }
        }
        System.out.println((answer) ? "Yes" : "No");
    }
}