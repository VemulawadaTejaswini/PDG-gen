import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
   
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws Exception{

        while(true) {
            String[] s = reader.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[2]);
            char op = s[1].charAt(0);

            int val = 0;
            switch(op) {
                case '+':
                    val = a + b;
                    break;
                case '-':
                    val = a - b;
                    break;
                case '*':
                    val = a * b;
                    break;
                case '/':
                    val = a / b;
                    break;
                case '?':
                    return;
                default:
                    break;
            }  

            System.out.println(val); 
        }
    
    }
}