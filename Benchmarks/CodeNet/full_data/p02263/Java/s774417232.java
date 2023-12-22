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
            double num2,num1;
            switch(input)
            {
                case "+":
                    num2 = Double.parseDouble(formula.poll());
                    num1 = Double.parseDouble(formula.poll());
                    formula.push(String.valueOf(num1+num2));
                    break;
                case "-":
                    num2 = Double.parseDouble(formula.poll());
                    num1 = Double.parseDouble(formula.poll());
                    formula.push(String.valueOf(num1-num2));
                    break;
                case "/":
                    num2 = Double.parseDouble(formula.poll());
                    num1 = Double.parseDouble(formula.poll());
                    formula.push(String.valueOf(num1/num2));
                    break;
                case "*":
                    num2 = Double.parseDouble(formula.poll());
                    num1 = Double.parseDouble(formula.poll());
                    formula.push(String.valueOf(num1*num2));
                    break;
                default:
                    formula.push(input);
                    break;
            }
        }
        double ans = Double.parseDouble(formula.poll());
        if(ans==(int)ans)
        {
            System.out.println((int)ans);
        }
        else
        {
            System.out.println(ans);
        }
    }
}