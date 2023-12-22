import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; ; i++) {
            String input = br.readLine();
            String param[] = input.split(" ");
            int x = Integer.parseInt(param[0]);
            int y = Integer.parseInt(param[1]);
            if(x == 0 && y == 0){
                break;
            }
            int max = Math.max(x, y);
            int min = Math.min(x, y);
            builder.append(min).append(" ").append(max).append("\n");
            
        }
        
        System.out.println(builder);
    }
}