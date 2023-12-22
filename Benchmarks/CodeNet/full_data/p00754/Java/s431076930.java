import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<String>();

        while(true){
            String s = sc.nextLine();
            if(s.equals(".")) break;

            Deque<String> deque = new ArrayDeque<>();
            deque.push("start");

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(') deque.push("(");
                if(s.charAt(i) == ')'){
                    if(deque.peek().equals("(")){
                        deque.pop();
                    }else{
                        deque.push(")");
                        break;
                    }
                }
                if(s.charAt(i) == '[') deque.push("[");
                if(s.charAt(i) == ']'){
                    if(deque.peek().equals("[")){
                        deque.pop();
                    }else{
                        deque.push("]");
                        break;
                    }
                }
            }

            if(deque.size() == 1){
                result.add("yes");
            }else{
                result.add("no");
            }
        }

        for(String i : result){
            System.out.println(i);
        }

        sc.close();
    }
}
