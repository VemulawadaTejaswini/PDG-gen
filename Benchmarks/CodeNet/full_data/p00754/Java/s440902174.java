import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String S = sc.nextLine();
            if(S.equals(".")) break;
            Deque<String> kakko = new ArrayDeque<>();
            int f = 1;
            for(int i = 0; i < S.length(); i++){
                char x = S.charAt(i);
                if(x == '(') kakko.push("(");
                if(x == '[') kakko.push("[");
                if(x == ')'){
                    if(kakko.isEmpty()||kakko.pop() != "("){
                        f = 0;
                        break;
                    }
                }
                if(x == ']'){
                    if(kakko.isEmpty()||kakko.pop() != "["){
                        f = 0;
                        break;
                    }
                }
            }
            if(f == 1&&kakko.isEmpty()) System.out.println("yes");
            else System.out.println("no");
            
        }
        sc.close();
        
    }
}

