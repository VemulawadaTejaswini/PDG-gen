import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt();
        String[] str = reader.readLine().split(" ");

        for (int i =n - 1; i < 0; i--) {
            builder.append(str[i] + " ");
        }
    }
}