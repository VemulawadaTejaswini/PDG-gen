import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        String[] t = br.readLine().split(" ");
        char[] tt = new char[t.length];
        for(int i = 0; i < t.length; i++){
            tt[i] = t[i].charAt(0);
        }
        for(int i = 0; i < t.length; i++){
            if(tt[i] == '+' || tt[i] == '-' || tt[i] == '*'){
                int ope1 = stack.pop();
                int ope2 = stack.pop();
                if(tt[i] == '+'){
                    stack.push(ope1 + ope2);
                }else if(tt[i] == '-'){
                    stack.push(ope2 - ope1);
                }else if(tt[i] == '*'){
                    stack.push(ope1 * ope2);
                }
            }else{
                int ope = Character.getNumericValue(tt[i]);
                stack.push(ope);
            }
        }
        int ans = stack.pop();
        System.out.println(ans);
    }

}