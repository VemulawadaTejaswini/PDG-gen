import java.util.Scanner;
import java.util.Stack;
  
public class Main {
      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          
        while(sc.hasNextLine()){
            Stack<Double> stack = new Stack<Double>();
 
            for(String s : sc.nextLine().split(" ")){
                if(s.equals("+")){
                    double d2 = stack.pop();
                    double d1 = stack.pop();
                    stack.push(d1 + d2);
                }else if(s.equals("-")){
                    double d2 = stack.pop();
                    double d1 = stack.pop();
                    stack.push(d1 - d2);
                }else if(s.equals("*")){
                    double d2 = stack.pop();
                    double d1 = stack.pop();
                    stack.push(d1 * d2);
                }else if(s.equals("/")){
                    double d2 = stack.pop();
                    double d1 = stack.pop();
                    stack.push(d1 / d2);
                }else{
                    stack.push(Double.parseDouble(s));
                }
            }
              
            System.out.println(stack.pop());
        }
          
    }
      
}