import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] data=reader.readLine().split(" ");
            int a=Integer.parseInt(data[0]);
            int b=Integer.parseInt(data[2]);
            
            if(data[1].equals("+")) System.out.print(a+b);
            else if(data[1].equals("-")) System.out.print(a-b);
            else if(data[1].equals("*")) System.out.print(a*b);
            else if(data[1].equals("/")) System.out.print(a/b);
            else if(data[1].equals("?")) break;
        }
    }
}