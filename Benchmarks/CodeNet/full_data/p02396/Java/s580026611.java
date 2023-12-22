import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    long count = 1;

        while(true){
            int x = Integer.parseInt(sc.nextLine());
            if(x == 0) break;
                sb.append("Case " + count + ": " + x + "\n");
                count++;
        }
        System.out.println(sb);
    }
}