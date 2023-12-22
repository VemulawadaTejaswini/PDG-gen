import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int S = Integer.parseInt(br.readLine());
            System.out.printf("%d:%d:%d\n", S/3600, (S%3600)/60, S%60);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
