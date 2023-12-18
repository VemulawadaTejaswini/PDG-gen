import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = null;
        try {
            read = br.readLine();
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        String str[] = read.split(" ", 0);
        int h = Integer.parseInt(str[0]);
        int a = Integer.parseInt(str[1]);
        PrintWriter pw = new PrintWriter(System.out);
        int i = 0;
        while (h > 0) {
            h = h - a;
            i++;
        }
        pw.println(i);
        pw.flush();
    }
}