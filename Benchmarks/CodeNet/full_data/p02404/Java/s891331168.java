import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader std = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String data[] = std.readLine().split(" ");
            int a = Integer.parseInt(data[0]);
            int b = Integer.parseInt(data[1]);
            if(a == 0 && b == 0) break;
            
            for(int i = 0; i < a; i++){
                for(int j = 0; j < b; j++){
                    if(i == 0 || i == a-1 || j == 0 || j == b-1)
                        sb.append("#");
                    else
                        sb.append(".");
            }
                sb.append("\n");
        }
            sb.append("\n");

    }
        System.out.print(sb);
    }
}