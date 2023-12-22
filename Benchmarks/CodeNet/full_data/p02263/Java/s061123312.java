import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * stack 栈(Last In First Out LIFO)后入先出
 * push() 在栈顶添加元素
 * pop() 移除栈顶元素
 * isEmpty() 检查栈是否为空
 * isFull() 检查栈是否为满
 */
public class Main{

    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]stringArray = br.readLine().split("\\s");
        Stack<Integer> stack = new Stack<Integer>();
        int a = 0;
        int b = 0;
        for (int i = 0; i<stringArray.length;i++){
            if (stringArray[i].equals("+"))
            {
                a = stack.pop();
                b = stack.pop();
                stack.add(b+a);
                continue;
            }
            if (stringArray[i].equals("-"))
            {
                a = stack.pop();
                b = stack.pop();
                stack.add(b-a);
                continue;
            }
            if (stringArray[i].equals("*"))
            {
                a = stack.pop();
                b = stack.pop();
                stack.add(b*a);
                continue;
            }
            if (stringArray[i].equals("/"))
            {
                a = stack.pop();
                b = stack.pop();
                stack.add(b / a);
                continue;
            }
            stack.push(Integer.parseInt(stringArray[i]));
        }
        System.out.println(stack.pop());
    }

}

