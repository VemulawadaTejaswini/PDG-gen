import java.util.*;
import java.lang.*;


public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> stack = new ArrayList<>();
        int pointer = -1;

        while(sc.hasNext()) {
            String x = sc.next();
            //if (x == "$") break;
            if (Character.isDigit(x.charAt(0))) {
                stack.add(Integer.parseInt(x));
                pointer++;
                //System.out.println("add " + x);
            } else {
                int a1 = stack.get(pointer - 1);
                int a2 = stack.get(pointer);
                int res = 0;
                switch (x){
                    case "+":
                        res = a1 + a2;
                        break;
                    case "-":
                        res = a1 - a2;
                        break;
                    case "*":
                        res = a1 * a2;
                        break;
                }
                stack.remove(pointer);
                stack.remove(pointer - 1);
                stack.add(res);
                //System.out.println(a1 + x + a2 + " = " + res);
                pointer--;
            }
        }
        System.out.println(stack.get(0));
    }
}
