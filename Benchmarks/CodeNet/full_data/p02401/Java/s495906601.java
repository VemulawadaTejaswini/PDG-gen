import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[2]);
        String op = line[1];
        
        if(op.equals("+")){
            System.out.println(a + b);
        }else if(op.equals("-")){
            System.out.println(a - b);
        }else if(op.equals("*")){
            System.out.println(a * b);
        }else if(op.equals("/")){
            System.out.println(a / b);
        }
    }
}