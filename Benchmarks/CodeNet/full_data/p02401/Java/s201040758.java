import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int MAX=20000;
        int MIN=0;
        
        while(true){
            String[] data=reader.readLine().split(" ");
            final int a=Integer.parseInt(data[0]);
            final int b=Integer.parseInt(data[2]);
            
            if(data[1].equals("?") break;
        
            if((MIN<=data[0] && data[0]<=MAX) && (MIN<=data[2] && data[2]<=MAX)){
                if(data[1].equals("+")) System.out.print(a+b);
                else if(data[1].equals("-")) System.out.print(a-b);
                else if(data[1].equals("*")) System.out.print(a*b);
                else if(data[1].equals("/")) System.out.print(a/b);
            }
        }
    }
}