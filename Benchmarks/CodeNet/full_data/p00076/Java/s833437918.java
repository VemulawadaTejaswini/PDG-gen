import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while(!(line = br.readLine()).equals("-1")){
            int n = Integer.parseInt(line);
            double x = 1.0;
            double y = 0.0;
            double deg = Math.PI;

            for(int i = 1; i < n; i++){
                deg -= Math.PI/2;
                x += Math.cos(deg);
                y += Math.sin(deg);
                deg = Math.atan(y/x);
            }

            System.out.printf("%.2f%n", y);
            System.out.printf("%.2f%n", x);
        }
    }
}
