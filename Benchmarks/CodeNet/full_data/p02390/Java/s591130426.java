import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            int S = Integer.parseInt(br.readLine());
            System.out.println(S / 3600 + ":" + S % 3600 / 60 + ":" + S % 60);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}