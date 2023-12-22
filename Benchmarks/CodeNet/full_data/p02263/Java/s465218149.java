import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Deque<String> formula = new ArrayDeque<String>();
        Scanner scan = new Scanner(System.in);
        String input;
        while((input = scan.next()) != null){
            switch(input){
                case "+":
                    input = String.valueOf(Integer.parseInt(formula.poll())+Integer.parseInt(formula.poll()));
                    break;
                case "-":
                    input = String.valueOf(-1*Integer.parseInt(formula.poll())+Integer.parseInt(formula.poll()));
                    break;
                case "*":
                    input = String.valueOf(Integer.parseInt(formula.poll())*Integer.parseInt(formula.poll()));
                    break;
            }
            formula.push(input);
        }
        System.out.println(formula.poll());
    }
}