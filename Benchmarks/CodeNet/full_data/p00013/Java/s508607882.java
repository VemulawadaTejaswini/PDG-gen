import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            if(a==0){
                System.out.println(stack.pop());
            }else{
                stack.push(a);
            }
        }
    }
}