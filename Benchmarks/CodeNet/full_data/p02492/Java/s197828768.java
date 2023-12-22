import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String op = sc.next();
        int y = sc.nextInt();
        int answer;

        if(op.equals("?")) return;
        if(op.equals("+"))answer = x+y;
        else if(op.equals("-"))answer = x-y;
        else if(op.equals("*"))answer = x*y;
        else if(op.equals("/"))answer = x/y;
        else return;
        System.out.println(answer);

    }
}