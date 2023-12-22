import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Pair{
    int position;
    int area;

    Pair(int pos, int area){
        this.position = pos;
        this.area = area;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        int sum = 0;
        ArrayDeque<Integer> stack1 = new ArrayDeque<>();
        ArrayDeque<Pair> stack2 = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        char[] chars = string.toCharArray();
        for (int i=0; i<chars.length; i++){
            if (chars[i] == '\\'){
                stack1.push(i);
            }
            else if (chars[i] == '/' && !stack1.isEmpty()){
                int j = stack1.pop();
                int temp = i-j;
                sum += temp;
                while (!stack2.isEmpty() && stack2.peek().position>j){
                    temp += stack2.pop().area;
                }
                stack2.push(new Pair(j, temp));
            }
        }

        // ?°?stack2?????¬
        ArrayDeque<Integer> stack3 = new ArrayDeque<>();
        while (!stack2.isEmpty()){
            stack3.push(stack2.pop().area);
        }

        System.out.println(sum);
        System.out.print(stack3.size());

        while (!stack3.isEmpty()){
            System.out.print(" " + stack3.pop());
        }
        System.out.println();
    }
}