import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            for(int i = 1; ; i++) {
                int x = Integer.parseInt(br.readLine());
                if(x == 0) {
                    break;
                }
                System.out.println("Case " + i + ": " + x);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}