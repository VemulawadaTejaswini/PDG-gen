import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.next());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            stack.push(Integer.parseInt(in.next()));
        }

        PrintWriter out = new PrintWriter(System.out);
        for(int i = 0; i < n-1; i++){
            out.printf("%d ", stack.pop());
        }
        
        out.println(stack.pop());
        out.flush();
    }
}
