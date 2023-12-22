import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        while(true){
            String data[] = br.readLine().split(" ");
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            if((0 <= x) && (y <= 10000)){
                if(x == 0 && y == 0){
                break;
                }
            output.append(Integer.toString(x<y?x:y)).append(" ").append(Integer.toString(x>y?x:y)).append("\n");
            }
        System.out.print(output);
        }
    }
}