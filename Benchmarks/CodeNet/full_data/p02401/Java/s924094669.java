import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str[] = br.readLine().split(" ");
            if(str[1].equals("?")) break;
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[2]);
            int c=0;
            switch (str[1]) {
                case "+":
                    c = a+b;
                    break;
                case "-":
                    c = a-b;
                    break;
                case "*":
                    c = a*b;
                    break;
                case "/":
                    c = a/b;
                    break;
                default:
                    break;
            }
            sb.append(c+"\n");
        }
        System.out.print(sb);
    }
}