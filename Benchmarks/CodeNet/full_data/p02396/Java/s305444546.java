import java.io.*;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            int cnt = 1;
            final int END = 0;
            
            while (true) {
                String line = reader.readLine();
                int num = Integer.parseInt(line);
                
                if (num == END) {
                    break;
                } else {
                    System.out.println("Case " + cnt + ": " + num);
                    cnt++;
                }
            }

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}