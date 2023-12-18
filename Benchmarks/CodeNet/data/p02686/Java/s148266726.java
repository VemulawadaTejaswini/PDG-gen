import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Description ：
 *
 * @author poyun
 * @version V1.0.0
 * @since 1.0
 * date 2020/5/10
 */
public class Main {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        Integer count = Integer.parseInt(n);
        LinkedList<String> list = new LinkedList <>();
        while (count>0){
            String line = input.nextLine();
            list.add(line);
            count--;
        }
        System.out.println(compare(list));
    }


    public static String compare(LinkedList<String> list){
        Stack<String> stack = new Stack <>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            char[] chars = s.toCharArray();
            for (int i1 = 0; i1 < chars.length; i1++) {
                if(chars[i1]=='(') stack.push("(");
                else{
                    if(stack.isEmpty()){
                        return "No";
                    }else{
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty()) return "Yes";
        return "No";
    }
}
