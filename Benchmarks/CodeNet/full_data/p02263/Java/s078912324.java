import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Deque<String> formula = new ArrayDeque<String>();
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext())
        {
            String input = scan.next();
            int num2,num1;
            switch(input)
            {
                case "+":
                    num2 = Integer.parseInt(formula.poll());
                    num1 = Integer.parseInt(formula.poll());
                    formula.push(String.valueOf(num1+num2));
                    break;
                case "-":
                    num2 = Integer.parseInt(formula.poll());
                    num1 = Integer.parseInt(formula.poll());
                    formula.push(String.valueOf(num1-num2));
                    break;
                case "*":
                    num2 = Integer.parseInt(formula.poll());
                    num1 = Integer.parseInt(formula.poll());
                    formula.push(String.valueOf(num1*num2));
                    break;
                default:
                    formula.push(input);
                    break;
            }
        }
        System.out.println(formula.poll());
    }
}