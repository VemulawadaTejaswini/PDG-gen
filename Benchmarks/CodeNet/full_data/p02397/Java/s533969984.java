import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            while(true) {
                String[] str = br.readLine().split(" ");
                int x = Integer.parseInt(str[0]);
                int y = Integer.parseInt(str[1]);
                if(x == 0 && y == 0) {
                    break;
                }
                System.out.println((x < y ? x : y) + " " + (x > y ? x : y));
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}