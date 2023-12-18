import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer a = Integer.parseInt(scan.next());
        Integer b = Integer.parseInt(scan.next());

        int c = (a+b)/2;
        if(Math.abs(a-c)==Math.abs(b-c))
            System.out.println(c);
        else
            System.out.println("IMPOSSIBLE");
    }
}