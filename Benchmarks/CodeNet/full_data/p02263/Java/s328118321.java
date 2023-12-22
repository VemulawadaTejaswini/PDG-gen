import java.util.Scanner;

import java.util.Stack;

public class Main {

   public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        
        Scanner scan = new Scanner(System.in);
 
        String input = scan.nextLine();
        String[] AK = input.split(" ",0);
        scan.close();
        int kfc = AK.length;   
        for(int i = 0; i < kfc; ++i) {
            
            if (AK[i].equals("+")) {
               int x = stack.pop(),y = stack.pop();
                stack.push(y + x);
            }
            else if (AK[i].equals("-")) {
                int x = stack.pop(),y = stack.pop();
                
                stack.push(y - x);
            }
            else if (AK[i].equals("*")) {
                int x = stack.pop(),y = stack.pop();
                int B = x*y;
                int C = B;
                stack.push(C);
            }
            else {
               stack.push(Integer.parseInt(AK[i]));
            }
        }
        System.out.println(stack.firstElement());
    }
 }
