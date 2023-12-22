import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        while(true){
        String line = br.readLine();
        int index = line.indexOf(" ");
        int x = Integer.parseInt(line.substring(0,index));
        int y = Integer.parseInt(line.substring(index+1,line.length()));
        if(x == 0&& y==0) break;
        str.append(x<y ? x+" "+y : y+" "+x).append("\n");
        }
        System.out.print(str);
    }
}