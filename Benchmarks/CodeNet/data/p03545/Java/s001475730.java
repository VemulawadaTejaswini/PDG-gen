import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1,in,out);
        out.close();
    }
    static class Task{
        public void solve(int testNumber,Scanner in,PrintWriter out){
            String s = in.next();
            int a = s.charAt(0) - '0';
            int b = s.charAt(1) - '0';
            int c = s.charAt(2) - '0';
            int d = s.charAt(3) - '0';
            int sum = 0;
            char op1='0',op2='0',op3='0';
            for(int i = 0 ; i < 2 ; i++){
                for(int j = 0 ; j < 2 ; j++){
                    for(int k = 0 ; k < 2 ; k++){
                        if(i == 0){
                            op1 = '+';
                            sum = a + b;
                        } else {
                            op1 = '-';
                            sum = a - b;
                        }
                        if(j == 0){
                            op2 = '+';
                            sum += c;
                        } else {
                            op2 = '-';
                            sum -= c;
                        }
                        if(k == 0){
                            op3 = '+';
                            sum += d;
                        } else {
                            op3 = '-';
                            sum -= d;
                        }
                        if(sum == 7){
                            break;
                        }
                    }
                    if(sum == 7){
                        break;
                    }
                }
                if(sum == 7){
                    break;
                }
            }
            out.print(a);
            out.print(op1);
            out.print(b);
            out.print(op2);
            out.print(c);
            out.print(op3);
            out.println(d + "=7");
        }
    }
}
