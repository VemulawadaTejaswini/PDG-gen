import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String data[]=reader.readLine().split(" ");
            int a=Integer.parseInt(data[0]);
            int b=Integer.parseInt(data[2]);
            String op=data[1];
            
            if(op.equals("+")) System.out.print(a+b);
            else if(op.equals("-")) System.out.print(a-b);
            else if(op.equals("*")) System.out.print(a*b);
            else if(op.equals("/")) System.out.print(a/b);
            else if(op.equals("?")) break;
        }
    }
}