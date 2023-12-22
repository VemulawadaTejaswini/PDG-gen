import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String line;
        // ????????\???
        while((line=br.readLine()) != null) {
            // ??????????????´??°?????????
            int time = Integer.parseInt(line);
            
            int hour = time / 3600;
            int minute = (time - (hour * 3600)) / 60;
            int second = time - (hour * 3600) - (minute * 60);
            
            System.out.println(hour + ":" + minute + ":" + second);
        }
    }
}