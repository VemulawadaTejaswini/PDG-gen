import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();

        int i;
        while(sc.hasNext()){
        	i = sc.nextInt();
        	if  (i == 0){stack.removeFirst();}
        	else        {stack.push(i);      }
        }

        //output
        while(!stack.isEmpty()){System.out.println(stack.pop());}
    }
}